package casev2;

import casev2.document.*;
import casev2.payment.*;
import casev2.student.*;
import casev2.ticket.*;
import casev2.transport.*;


public class App {
    public static void main(String[] args) {
        System.out.println("--- Refactored Ticket Service (SRP, OCP, DIP) ---");
        TicketService ts = new TicketService(
            new MySqlStudentRepository(),
            new GoPayProcessor(),
            new EmailNotificationService(),
            new StandardTicketPrinter()
        );
        ts.processOrder(new Student("S123", "Budi"), "s123@kampus.ac.id");

        System.out.println("\n--- Refactored Payment Service (OCP, DIP) ---");
        PaymentService psBni = new PaymentService(new BNIGateway());
        psBni.pay(100_000);
        PaymentService psMandiri = new PaymentService(new MandiriGateway());
        psMandiri.pay(200_000);
        
        System.out.println("\n--- Refactored Transport (LSP) ---");
        Bicycle bike = new Bicycle();
        bike.setSpeed(10);
        bike.ride();

        Car car = new Car();
        car.setSpeed(80);
        car.startEngine();

        System.out.println("\n--- Refactored Device (ISP) ---");
        Printer printer = new SimplePrinter();
        printer.print(new Document());
    }
}