public class Act2VehicleService {
    // Singleton instance of Act2VehicleService
    private static final Act2VehicleService instance;
    private IVehicleInspector inspector;

    // Static block to initialize the Singleton with Dependency Injection
    static {
        // Read the system property "vi" to determine which inspector to use
        String viProperty = System.getProperty("vi");

        // Use the factory to inject the correct inspector
        IVehicleInspector selectedInspector = VehicleFactory.getVehicleInspector(viProperty);
        instance = new Act2VehicleService(selectedInspector);
    }

    // Private constructor to prevent direct instantiation
    private Act2VehicleService(IVehicleInspector inspector) {
        this.inspector = inspector;
    }

    // Public accessor to get the Singleton instance
    public static Act2VehicleService getInstance() {
        return instance;
    }

    // Method to calculate a total inspection score
    public int calculateTotal() {
        int total = 0;

        // Inspect different vehicles and add up the results
        total += inspector.visit(new Car("Red", 2021));
        total += inspector.visit(new Motorbike("Blue", 2020, 250));
        total += inspector.visit(new Van("White", 2019, 5));

        return total;
    }
}
