import java.util.Scanner;

public class ArrayIndexOutOfBounds {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing index beyond array length
        System.out.println("Accessing index " + names.length + ": " + names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            // Accessing index beyond array length
            System.out.println("Accessing index " + names.length + ": " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
            System.out.println("Valid index range is 0 to " + (names.length - 1));
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        String[] names = new String[size];

        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        // Step 1: Call method that generates exception
        System.out.println("\n---- Generating Exception ----");
        try {
            generateException(names); // will crash
        } catch (Exception e) {
            System.out.println("Program crashed here with exception: " + e);
        }

        // Step 2: Call method that handles exception
        System.out.println("\n---- Handling Exception ----");
        handleException(names);

        sc.close();
    }
}
