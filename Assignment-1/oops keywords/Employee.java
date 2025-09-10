public class Employee {
    // Static
    private static String companyName = "Tech Solutions";
    private static int totalEmployees = 0;

    // Instance variables
    private String name;
    private String designation;
    private final int id; // Final

    // Constructor using 'this'
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Display details
    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Rahul", "Developer");
        Employee e2 = new Employee(2, "Priya", "Manager");

        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }
}
