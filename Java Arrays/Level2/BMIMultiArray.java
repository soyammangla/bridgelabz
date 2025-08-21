import java.util.Scanner;

public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // Step 2: 2D array for weight, height, BMI
        double[][] personData = new double[n][3]; 
        String[] weightStatus = new String[n];

        // Step 3: Input weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            // weight input validation
            double weight;
            do {
                System.out.print("Enter weight (kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("❌ Weight must be positive. Try again!");
                }
            } while (weight <= 0);

            // height input validation
            double height;
            do {
                System.out.print("Enter height (m): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("❌ Height must be positive. Try again!");
                }
            } while (height <= 0);

            // Store weight and height
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 4: Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": " +
                               "Height = " + personData[i][1] + " m, " +
                               "Weight = " + personData[i][0] + " kg, " +
                               "BMI = " + String.format("%.2f", personData[i][2]) + ", " +
                               "Status = " + weightStatus[i]);
        }

        sc.close();
    }
}
