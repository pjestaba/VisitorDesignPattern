public class TestSingleton {
    public static void main(String[] args) {
        // Retrieve the Singleton instance twice
        Act2VehicleService service1 = Act2VehicleService.getInstance();
        Act2VehicleService service2 = Act2VehicleService.getInstance();

        // Check if both references point to the same instance
        System.out.println("Singleton Test: " + (service1 == service2)); // Should print "true"

        // Test calculateTotal method
        int total = service1.calculateTotal();
        System.out.println("Total: " + total);
    }
}
