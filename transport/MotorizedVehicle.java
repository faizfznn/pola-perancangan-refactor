package casev2.transport;

// Liskov Substitution Principle (LSP) - Motorized vehicles have engines
public abstract class MotorizedVehicle extends Vehicle {
    protected boolean engineRunning;
    
    public void startEngine() {
        engineRunning = true;
        System.out.println("Engine started");
    }
    
    public void stopEngine() {
        engineRunning = false;
        System.out.println("Engine stopped");
    }
    
    public boolean isEngineRunning() {
        return engineRunning;
    }
}