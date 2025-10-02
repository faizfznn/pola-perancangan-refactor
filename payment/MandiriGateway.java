package casev2.payment;

public class MandiriGateway implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("[Mandiri] transfer " + amount);
    }
}