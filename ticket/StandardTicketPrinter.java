package casev2.ticket;

public class StandardTicketPrinter implements TicketPrinter {
    @Override
    public void printTicket() {
        System.out.println("Printing ticket...");
    }
}