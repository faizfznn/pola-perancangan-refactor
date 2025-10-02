package casev2.transport;

// Liskov Substitution Principle (LSP) - Car is a motorized vehicle
public class Car extends MotorizedVehicle {
    
    @Override
    public void ride() {
        if (engineRunning) {
            System.out.println("Driving car at " + speed + " km/h");
        } else {
            System.out.println("Cannot drive car - engine is not running");
        }
    }
}