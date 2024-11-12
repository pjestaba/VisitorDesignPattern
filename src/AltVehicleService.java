public class AltVehicleService {
    public int inspectVehicle(IVehicle vehicle, IVehicleInspector inspector) {
        return vehicle.accept(inspector);
    }
}
