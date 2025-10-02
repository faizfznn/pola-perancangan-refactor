package casev2.ticket;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String email, String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }
}