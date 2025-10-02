package casev2.payment;

public class BNIGateway implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("[BNI] transfer " + amount);
    }
}