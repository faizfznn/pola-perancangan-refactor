package casev2.ticket;

import casev2.student.Student;
import casev2.student.StudentRepository;

public class TicketService {
    private int quota = 100;
    private final StudentRepository studentRepository;
    private final PaymentProcessor paymentProcessor;
    private final NotificationService notificationService;
    private final TicketPrinter ticketPrinter;

    public TicketService(StudentRepository studentRepository, PaymentProcessor paymentProcessor, NotificationService notificationService, TicketPrinter ticketPrinter) {
        this.studentRepository = studentRepository;
        this.paymentProcessor = paymentProcessor;
        this.notificationService = notificationService;
        this.ticketPrinter = ticketPrinter;
    }

    public void processOrder(Student student, String email) {
        if (quota <= 0) {
            System.out.println("Sold out");
            return;
        }

        studentRepository.save(student);
        paymentProcessor.processPayment("S123");
        notificationService.sendNotification(email, "Your ticket has been processed.");
        ticketPrinter.printTicket();
        quota--;
    }

    public int getQuota() { return quota; }
}