package casev2.ticket;

import casev2.student.Student;
import casev2.student.StudentRepository;

// Single Responsibility Principle (SRP), Open/Closed Principle (OCP), Dependency Inversion Principle (DIP)
public class TicketService {
    private int quota = 100;
    private StudentRepository studentRepository;
    private PaymentProcessor paymentProcessor;
    private NotificationService notificationService;
    private TicketPrinter ticketPrinter;
    
    public TicketService(StudentRepository studentRepository, 
                        PaymentProcessor paymentProcessor,
                        NotificationService notificationService,
                        TicketPrinter ticketPrinter) {
        this.studentRepository = studentRepository;
        this.paymentProcessor = paymentProcessor;
        this.notificationService = notificationService;
        this.ticketPrinter = ticketPrinter;
    }
    
    public void processOrder(Student student, String email) {
        System.out.println("TicketService: Processing order for " + student.getName());
        
        // Check quota availability
        if (quota <= 0) {
            System.out.println("Sold out");
            return;
        }
        
        // Validate student exists
        if (!studentRepository.exists(student.getId())) {
            studentRepository.save(student);
        }
        
        // Process payment
        double ticketPrice = 50000; // Rp 50,000
        boolean paymentSuccess = paymentProcessor.processPayment(ticketPrice);
        
        if (paymentSuccess) {
            // Print ticket
            ticketPrinter.printTicket(student);
            
            // Send notification
            String message = "Your ticket has been processed successfully. Total: Rp " + ticketPrice;
            notificationService.sendNotification(message, email);
            
            // Decrease quota
            quota--;
            
            System.out.println("TicketService: Order processed successfully!");
            System.out.println("Order processed. Quota remaining: " + quota);
        } else {
            System.out.println("TicketService: Payment failed. Order not processed.");
        }
    }
    
    public int getQuota() {
        return quota;
    }
}