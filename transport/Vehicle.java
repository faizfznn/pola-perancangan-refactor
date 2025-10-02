package casev2.transport;

public abstract class Vehicle {
    protected int speed;

    public void setSpeed(int s) {
        this.speed = s;
    }

    public int getSpeed() {
        return speed;
    }
}