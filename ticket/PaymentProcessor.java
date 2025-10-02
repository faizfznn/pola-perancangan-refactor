package casev2.ticket;

// Single Responsibility Principle (SRP) - Payment processing interface
public interface PaymentProcessor {
    boolean processPayment(double amount);
}