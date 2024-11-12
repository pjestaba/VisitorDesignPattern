public class AltVehicleInspection implements IVehicleInspector {

    @Override
    public int visit(Car car) {
        System.out.println("Inspecting Car - Color: " + car.getColor() + ", Year: " + car.getManufactureDate());
        return car.getManufactureDate() * 2;
    }

    @Override
    public int visit(Motorbike motorbike) {
        System.out.println("Inspecting Motorbike - Color: " + motorbike.getColor() + ", Year: " + motorbike.getManufactureDate());
        return motorbike.getManufactureDate() * 3;
    }

    @Override
    public int visit(Van van) {
        System.out.println("Inspecting Van - Color: " + van.getColor() + ", Year: " + van.getManufactureDate());
        return van.getManufactureDate() * 4;
    }
}
