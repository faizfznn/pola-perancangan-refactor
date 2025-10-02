package casev2.payment;

public class BNIGateway implements PaymentGateway {
    
    @Override
    public boolean processPayment(double amount) {
        System.out.println("BNI Gateway: Processing payment of Rp " + amount);
        // Simulate payment processing
        return true;
    }
    
    @Override
    public String getGatewayName() {
        return "BNI";
    }
}