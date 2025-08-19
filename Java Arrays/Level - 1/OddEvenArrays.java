import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check if natural number (>=1)
        if (number < 1) {
            System.out.println("Error: Please enter a natural number (greater than 0).");
        }

        // Arrays for even and odd numbers
        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        // Index trackers
        int evenIndex = 0, oddIndex = 0;

        // Fill arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        // Print odd numbers
        System.out.print("\nOdd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        // Print even numbers
        System.out.print("\nEven Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close();
    }
}
