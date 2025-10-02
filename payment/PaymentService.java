package casev2.payment;

// Open/Closed Principle (OCP) and Dependency Inversion Principle (DIP)
public class PaymentService {
    private PaymentGateway paymentGateway;
    
    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    
    public boolean pay(double amount) {
        System.out.println("PaymentService: Initiating payment through " + paymentGateway.getGatewayName());
        return paymentGateway.processPayment(amount);
    }
    
    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
}