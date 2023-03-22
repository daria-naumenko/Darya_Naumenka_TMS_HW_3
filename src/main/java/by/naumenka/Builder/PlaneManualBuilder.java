package by.naumenka.Builder;

public class PlaneManualBuilder implements Builder{
    private PlaneType type;
    private int seats;
    private Engine engine;

    @Override
    public void setPlaneType(PlaneType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine);
    }
}
