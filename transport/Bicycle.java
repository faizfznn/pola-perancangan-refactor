package casev2.transport;

public class Bicycle extends Vehicle {
    // Tidak ada implementasi startEngine()
    public void ride() {
        System.out.println("Riding bicycle at speed " + speed);
    }
}