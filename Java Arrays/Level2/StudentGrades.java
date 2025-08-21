import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step 2: Arrays to store data
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Step 3: Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + " (out of 100):");

            // Physics marks
            System.out.print("Physics: ");
            int p = sc.nextInt();
            if (p < 0 || p > 100) {
                System.out.println("❌ Invalid marks! Please enter between 0 and 100.");
                i--; // repeat this student input
                continue;
            }
            physics[i] = p;

            // Chemistry marks
            System.out.print("Chemistry: ");
            int c = sc.nextInt();
            if (c < 0 || c > 100) {
                System.out.println("❌ Invalid marks! Please enter between 0 and 100.");
                i--; 
                continue;
            }
            chemistry[i] = c;

            // Maths marks
            System.out.print("Maths: ");
            int m = sc.nextInt();
            if (m < 0 || m > 100) {
                System.out.println("❌ Invalid marks! Please enter between 0 and 100.");
                i--; 
                continue;
            }
            maths[i] = m;

            // Step 4: Calculate percentage
            int total = p + c + m;
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
                    + "Physics = " + physics[i] + ", "
                    + "Chemistry = " + chemistry[i] + ", "
                    + "Maths = " + maths[i] + ", "
                    + "Percentage = " + String.format("%.2f", percentage[i]) + "%, "
                    + "Grade = " + grade[i]);
        }

        sc.close();
    }
}
