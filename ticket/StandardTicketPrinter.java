package casev2.ticket;

import casev2.student.Student;

public class StandardTicketPrinter implements TicketPrinter {
    
    @Override
    public void printTicket(Student student) {
        System.out.println("StandardTicketPrinter: Printing ticket for " + student.getName() + " (ID: " + student.getId() + ")");
        System.out.println("==========================================");
        System.out.println("           STUDENT TICKET                ");
        System.out.println("==========================================");
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Date: " + java.time.LocalDateTime.now());
        System.out.println("==========================================");
    }
}