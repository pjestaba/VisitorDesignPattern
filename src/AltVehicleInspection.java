public class AltVehicleInspection implements IVehicleInspector {
    @Override
    public int visit(Car car) {
        return 4500; // Alternative inspection fee for Car
    }

    @Override
    public int visit(Motorbike motorbike) {
        return 6500; // Alternative inspection fee for Motorbike
    }

    @Override
    public int visit(Van van) {
        return 8500; // Alternative inspection fee for Van
    }
}
