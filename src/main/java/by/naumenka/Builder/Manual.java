package by.naumenka.Builder;

public class Manual {
    private final PlaneType planeType;
    private final int seats;
    private final Engine engine;

    public Manual(PlaneType type, int seats, Engine engine) {
        this.planeType = type;
        this.seats = seats;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "planeType=" + planeType +
                ", seats=" + seats +
                ", engine=" + engine +
                '}';
    }
}
