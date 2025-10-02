package casev2.ticket;

// Single Responsibility Principle (SRP) - Notification interface
public interface NotificationService {
    void sendNotification(String message, String recipient);
}