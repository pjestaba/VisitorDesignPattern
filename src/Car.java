// src/Car.java
public class Car implements IVehicle {
    private String color;
    private int manufactureDate;

    public Car(String color, int manufactureDate) {
        this.color = color;
        this.manufactureDate = manufactureDate;
    }

    @Override
    public int accept(IVehicleInspector vehicleInspector) {
        return vehicleInspector.visit(this);
    }

    @Override
    public float co2Emissions() {
        return 8887 * (1 + (0.05f * (2020 - manufactureDate)));
    }
}
