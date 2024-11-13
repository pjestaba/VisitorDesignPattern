// src/Motorbike.java
public class Motorbike implements IVehicle {
    private String color;
    private int manufactureDate;
    private int engineCapacity;

    public Motorbike(String color, int manufactureDate, int engineCapacity) {
        this.color = color;
        this.manufactureDate = manufactureDate;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public int accept(IVehicleInspector vehicleInspector) {
        return vehicleInspector.visit(this);
    }

    @Override
    public float co2Emissions() {
        return 8887 * (1 + (0.01f * (100 - engineCapacity)));
    }
}
