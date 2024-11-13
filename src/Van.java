// src/Van.java
public class Van implements IVehicle {
    private String color;
    private int manufactureDate;
    private int numberOfDoors;

    public Van(String color, int manufactureDate, int numberOfDoors) {
        this.color = color;
        this.manufactureDate = manufactureDate;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public int accept(IVehicleInspector vehicleInspector) {
        return vehicleInspector.visit(this);
    }

    @Override
    public float co2Emissions() {
        return 8887 * (1 + (0.1f * (numberOfDoors - 2)));
    }
}
