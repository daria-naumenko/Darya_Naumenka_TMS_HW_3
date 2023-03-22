package by.naumenka.Builder;

public class Director {
    public void constructPassengerPlane(Builder builder) {
        builder.setPlaneType(PlaneType.PASSENGER_PLANE);
        builder.setSeats(150);
        builder.setEngine(new Engine(100.0, 0));
    }

    public void constructMilitaryPlane(Builder builder) {
        builder.setPlaneType(PlaneType.MILITARY_PLANE);
        builder.setSeats(50);
        builder.setEngine(new Engine(110.0, 0));
    }
}
