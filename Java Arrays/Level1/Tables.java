import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store results for 6,7,8,9 (total 4 results)
        int[] multiplicationResult = new int[4];

        // Calculate multiplication for 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display results
        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        sc.close();
    }
}

