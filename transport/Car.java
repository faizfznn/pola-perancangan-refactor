package casev2.transport;

public class Car extends MotorizedVehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started at speed " + speed);
    }
}