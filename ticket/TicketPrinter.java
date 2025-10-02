package casev2.ticket;

import casev2.student.Student;

// Single Responsibility Principle (SRP) - Ticket printing interface
public interface TicketPrinter {
    void printTicket(Student student);
}