package by.naumenka.Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        PlaneBuilder builder = new PlaneBuilder();
        director.constructPassengerPlane(builder);

        Plane plane = builder.getResult();
        System.out.println("Plane built:\n" + plane.getPlaneType());


        PlaneManualBuilder manualBuilder = new PlaneManualBuilder();
        director.constructMilitaryPlane(manualBuilder);
        Manual PlaneManual = manualBuilder.getResult();
        System.out.println("\nPlane manual built:\n" + PlaneManual.toString());
    }
}