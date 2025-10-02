package casev2.transport;

// Liskov Substitution Principle (LSP) - Base vehicle class
public abstract class Vehicle {
    protected int speed;
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public abstract void ride();
}