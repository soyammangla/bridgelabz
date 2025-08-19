import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of 10 elements
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 positive numbers (enter 0 or a negative number to stop):");

        // Infinite loop
        while (true) {
            System.out.print("Enter number: ");
            double num = sc.nextDouble();

            // Break if number is 0 or negative
            if (num <= 0) {
                break;
            }

            // Break if array is full
            if (index == 10) {
                System.out.println("Array is full (10 numbers stored).");
                break;
            }

            // Store number in array
            numbers[index] = num;
            index++;
        }

        // Calculate sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Display total
        System.out.println("\nTotal sum = " + total);

        sc.close();
    }
}
