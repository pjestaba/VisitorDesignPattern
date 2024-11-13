public class Act2Main {
    public static void main(String[] args) {
        // Access the Singleton instance of Act2VehicleService
        Act2VehicleService service = Act2VehicleService.getInstance();
        
        // Calculate and print the total inspection result
        int total = service.calculateTotal();
        System.out.println("Total: " + total);
    }
}
