import java.util.Scanner;

public class NumberFormat {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // Try to convert text to integer (will throw exception if not a number)
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
            System.out.println("Input must be a valid number.");
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
            generateException(text); // will crash if input is not a number
        } catch (Exception e) {
            System.out.println("Program crashed here with exception: " + e);
        }

        // Step 2: Call method that handles exception
        System.out.println("\n---- Handling Exception ----");
        handleException(text);

        sc.close();
    }
}
