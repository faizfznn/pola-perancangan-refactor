package casev2.ticket;

public class EmailNotificationService implements NotificationService {
    
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("EmailNotificationService: Sending email to " + recipient);
        System.out.println("Message: " + message);
    }
}