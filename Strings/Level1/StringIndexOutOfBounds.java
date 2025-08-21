import java.util.Scanner;

public class StringIndexOutOfBounds {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Accessing index beyond string length
        System.out.println("Character at index " + text.length() + " : " + text.charAt(text.length()));
        // Note: last valid index is text.length() - 1
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            // Accessing index beyond string length
            System.out.println("Character at index " + text.length() + " : " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("You tried to access an invalid index. Valid range is 0 to " + (text.length() - 1));
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
            generateException(text); // will crash without handling
        } catch (Exception e) {
            System.out.println("Program crashed here with exception: " + e);
        }

        // Step 2: Call method that handles exception
        System.out.println("\n---- Handling Exception ----");
        handleException(text);

        sc.close();
    }
}
