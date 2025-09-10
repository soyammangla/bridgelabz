public class Vehicle {
    // Static
    private static double registrationFee = 5000.0;

    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber; // Final

    // Constructor
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

    // Display details
    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("HR26AB1234", "Rohan", "Car");
        Vehicle v2 = new Vehicle("DL8CAB5678", "Neha", "Bike");

        v1.displayDetails();
        v2.displayDetails();

        Vehicle.updateRegistrationFee(6000);
    }
}
