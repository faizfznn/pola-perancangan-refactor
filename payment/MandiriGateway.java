package casev2.payment;

public class MandiriGateway implements PaymentGateway {
    
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Mandiri Gateway: Processing payment of Rp " + amount);
        // Simulate payment processing
        return true;
    }
    
    @Override
    public String getGatewayName() {
        return "Mandiri";
    }
}