package by.naumenka.Builder;

public class Plane {
    private final PlaneType planeType;
    private final int seats;
    private final Engine engine;
    private double fuel = 0;

    public Plane(PlaneType planeType, int seats, Engine engine) {
        this.planeType = planeType;
        this.seats = seats;
        this.engine = engine;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
