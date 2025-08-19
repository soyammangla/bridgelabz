import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of 5 elements
        int[] arr = new int[5];

        // Taking input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Check positive, negative, zero, even, odd
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is Positive and Even");
                } else {
                    System.out.println(arr[i] + " is Positive and Odd");
                }
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is Negative");
            } else {
                System.out.println(arr[i] + " is Zero");
            }
        }

        // Compare first and last element
        int first = arr[0];
        int last = arr[arr.length - 1];

        System.out.println("\nComparison between first and last element:");
        if (first == last) {
            System.out.println("First element (" + first + ") is equal to Last element (" + last + ")");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than Last element (" + last + ")");
        } else {
            System.out.println("First element (" + first + ") is less than Last element (" + last + ")");
        }

        sc.close();
    }
}

