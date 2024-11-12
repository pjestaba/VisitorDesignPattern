public class AltMain {
    public static void main(String[] args) {
        // Correct instantiation of vehicles with the updated constructors
        IVehicle car = new Car("Red", 2021);
        IVehicle van = new Van("White", 2019, 5); // Added numberOfDoors parameter
        IVehicle motorbike = new Motorbike("Blue", 2020, 250); // Added engineCapacity parameter

        // Create an inspector
        IVehicleInspector inspector = new AltVehicleInspection();

        // Inspect each vehicle
        AltVehicleService service = new AltVehicleService();
        System.out.println("Car Inspection Result: " + service.inspectVehicle(car, inspector));
        System.out.println("Van Inspection Result: " + service.inspectVehicle(van, inspector));
        System.out.println("Motorbike Inspection Result: " + service.inspectVehicle(motorbike, inspector));
    }
}
