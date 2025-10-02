package casev2.ticket;

public class GoPayProcessor implements PaymentProcessor {
    @Override
    public void processPayment(String studentId) {
        System.out.println("Paid with GoPay for student " + studentId);
    }
}