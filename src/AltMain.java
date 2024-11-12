public class AltMain {
    public static void main(String[] args) {
        IVehicle car = new Car("Blue", 2024);
        IVehicle van = new Van("Yellow", 2005, 5); 
        IVehicle motorbike = new Motorbike("Blue", 2022, 250); 

        IVehicleInspector inspector = new AltVehicleInspection();

        AltVehicleService service = new AltVehicleService();
        System.out.println("Car Inspection Result: " + service.inspectVehicle(car, inspector));
        System.out.println("Van Inspection Result: " + service.inspectVehicle(van, inspector));
        System.out.println("Motorbike Inspection Result: " + service.inspectVehicle(motorbike, inspector));
    }
}
