// src/Act3VehicleService.java
public class Act3VehicleService {
    private static final Act3VehicleService instance;
    private IVehicleInspector inspector;
    private IEmissionsStrategy emissionsStrategy;

    static {
        String viProperty = System.getProperty("vi");
        String esProperty = System.getProperty("es");

        IVehicleInspector selectedInspector = VehicleFactory.getVehicleInspector(viProperty);
        IEmissionsStrategy selectedStrategy;

        if (esProperty == null) {
            selectedStrategy = new NullEmissionsStrategy();
        } else {
            switch (esProperty) {
                case "one":
                    selectedStrategy = new OneEmissionsStrategy();
                    break;
                case "two":
                    selectedStrategy = new TwoEmissionsStrategy();
                    break;
                default:
                    selectedStrategy = new NullEmissionsStrategy();
                    break;
            }
        }

        instance = new Act3VehicleService(selectedInspector, selectedStrategy);
    }

    private Act3VehicleService(IVehicleInspector inspector, IEmissionsStrategy emissionsStrategy) {
        this.inspector = inspector;
        this.emissionsStrategy = emissionsStrategy;
    }

    public static Act3VehicleService getInstance() {
        return instance;
    }

    public int calculateTotal() {
        int total = 0;

        IVehicle[] vehicles = {
            new Car("Red", 2021),
            new Motorbike("Blue", 2020, 250),
            new Van("White", 2019, 5)
        };

        System.out.println("Vehicle list initialized with " + vehicles.length + " vehicles.");

        for (IVehicle vehicle : vehicles) {
            int inspectionCharge = vehicle.accept(inspector);
            int emissionsFee = emissionsStrategy.computeEmissionsFee(vehicle);
            int combinedCharge = inspectionCharge + emissionsFee;

            System.out.println("Inspection charge for " + vehicle.getClass().getSimpleName() + ": " + inspectionCharge);
            System.out.println("Emissions fee for " + vehicle.getClass().getSimpleName() + ": " + emissionsFee);
            System.out.println("Combined charge for " + vehicle.getClass().getSimpleName() + ": " + combinedCharge);

            total += combinedCharge;
        }

        System.out.println("Total Service Charge: " + total);
        System.out.println("Total Service charge calculated successfully.");
        return total;
    }
}
