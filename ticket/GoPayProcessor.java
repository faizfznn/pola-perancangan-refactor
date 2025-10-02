package casev2.ticket;

public class GoPayProcessor implements PaymentProcessor {
    
    @Override
    public boolean processPayment(double amount) {
        System.out.println("GoPayProcessor: Processing payment of Rp " + amount);
        // Simulate payment processing
        return true;
    }
}