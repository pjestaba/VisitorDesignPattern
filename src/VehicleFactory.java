public class VehicleFactory {
    private VehicleFactory() {} // Private constructor to prevent instantiation

    public static IVehicleInspector getVehicleInspector(String prop) {
        if ("alt".equalsIgnoreCase(prop)) {
            return new AltVehicleInspection();
        }
        return new VehicleInspection();
    }
}
