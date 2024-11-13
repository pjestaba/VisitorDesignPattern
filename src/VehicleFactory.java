public class VehicleFactory {
    private VehicleFactory() {}

    public static IVehicleInspector getVehicleInspector(String prop) {
        if ("alt".equalsIgnoreCase(prop)) {
            return new AltVehicleInspection();
        }
        return new VehicleInspection();
    }
}
