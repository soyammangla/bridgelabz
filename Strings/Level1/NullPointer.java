public class NullPointer {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // String reference is null
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to demonstrate handling NullPointerException
    public static void handleException() {
        String text = null; // String reference is null

        try {
            // This will throw NullPointerException
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("You tried to access a method on a null object.");
        }
    }

    public static void main(String[] args) {
        // Step 1: Call method that generates exception
        System.out.println("---- Generating Exception ----");
        try {
            generateException();  // this will crash if not caught
        } catch (Exception e) {
            System.out.println("Program crashed here with exception: " + e);
        }

        // Step 2: Call method that handles exception
        System.out.println("\n---- Handling Exception ----");
        handleException();
    }
}
