public class VehicleInspection implements IVehicleInspector {
    @Override
    public int visit(Car car) {
        return 4042; 
    }

    @Override
    public int visit(Motorbike motorbike) {
        return 6060; 
    }

    @Override
    public int visit(Van van) {
        return 8076; 
    }
}
