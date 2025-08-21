import java.util.Scanner;

public class IllegalArguments {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        // Start index > End index will throw IllegalArgumentException
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            // Start index > End index
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) { 
            // Generic runtime exception handler
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Step 1: Call method that generates exception
        System.out.println("\n---- Generating Exception ----");
        try {
            generateException(text); // will crash
        } catch (Exception e) {
            System.out.println("Program crashed here with exception: " + e);
        }

        // Step 2: Call method that handles exception
        System.out.println("\n---- Handling Exception ----");
        handleException(text);

        sc.close();
    }
}
