import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step 2: Arrays
        int[][] marks = new int[n][3];   // [student][subject]
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Step 3: Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + " (out of 100):");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                int m = sc.nextInt();

                if (m < 0 || m > 100) {
                    System.out.println("❌ Invalid marks! Please enter between 0 and 100.");
                    j--; // repeat same subject input
                    continue;
                }
                marks[i][j] = m;
            }

            // Step 4: Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Step 5: Assign grade
            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 75) {
                grade[i] = 'B';
            } else if (percentage[i] >= 50) {
                grade[i] = 'C';
            } else {
                grade[i] = 'D';
            }
        }

        // Step 6: Display results
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": "
                    + "Physics = " + marks[i][0] + ", "
                    + "Chemistry = " + marks[i][1] + ", "
                    + "Maths = " + marks[i][2] + ", "
                    + "Percentage = " + String.format("%.2f", percentage[i]) + "%, "
                    + "Grade = " + grade[i]);
        }

        sc.close();
    }
}
