package casev2.payment;

// Dependency Inversion Principle (DIP) - Abstract payment gateway
public interface PaymentGateway {
    boolean processPayment(double amount);
    String getGatewayName();
}