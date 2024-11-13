public class Act3Main {
    public static void main(String[] args) {
        Act3VehicleService service = Act3VehicleService.getInstance();
        int total = service.calculateTotal();
        System.out.println("Total: " + total);
    }
}
