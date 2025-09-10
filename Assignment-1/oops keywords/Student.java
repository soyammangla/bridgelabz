public class Student {
    // Static
    private static String universityName = "Delhi University";
    private static int totalStudents = 0;

    // Instance variables
    private String name;
    private String grade;
    private final int rollNumber; // Final

    // Constructor
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    // Static method
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Display details
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Aman", "A");
        Student s2 = new Student(2, "Riya", "B");

        s1.displayStudentDetails();
        s2.displayStudentDetails();

        Student.displayTotalStudents();
    }
}
