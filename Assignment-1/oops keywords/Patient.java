public class Patient {
    // Static
    private static String hospitalName = "AIIMS Hospital";
    private static int totalPatients = 0;

    // Instance variables
    private String name;
    private int age;
    private String ailment;
    private final int patientID; // Final

    // Constructor
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static method
    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    // Display details
    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient(101, "Ankit", 30, "Fever");
        Patient p2 = new Patient(102, "Ritu", 25, "Fracture");

        p1.displayDetails();
        p2.displayDetails();

        Patient.getTotalPatients();
    }
}
