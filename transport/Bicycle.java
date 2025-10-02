package casev2.transport;

// Liskov Substitution Principle (LSP) - Bicycle is a non-motorized vehicle
public class Bicycle extends Vehicle {
    
    @Override
    public void ride() {
        System.out.println("Riding bicycle at " + speed + " km/h");
    }
}