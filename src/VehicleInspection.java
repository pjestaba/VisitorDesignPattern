public class VehicleInspection implements IVehicleInspector {
    @Override
    public int visit(Car car) {
        return 4042; // Inspection fee for Car
    }

    @Override
    public int visit(Motorbike motorbike) {
        return 6060; // Inspection fee for Motorbike
    }

    @Override
    public int visit(Van van) {
        return 8076; // Inspection fee for Van
    }
}
