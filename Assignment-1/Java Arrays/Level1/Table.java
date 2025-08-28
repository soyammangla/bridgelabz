import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store results from 1 to 10
        int[] table = new int[10];

        // Calculate multiplication and store in array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display results
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
