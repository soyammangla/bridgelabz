package
Strings.Level1;
public class NullPointer {

    public static void generateException() {
        String text = null; 
        System.out.println("Length of text: " + text.length());
    }

    public static void handleException() {
        String text = null; 

        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("You tried to access a method on a null object.");
        }
    }

    public static void main(String[] args) {
        System.out.println("---- Generating Exception ----");
        try {
            generateException(); 
        } catch (Exception e) {
            System.out.println("Program crashed here with exception: " + e);
        }

        System.out.println("\n---- Handling Exception ----");
        handleException();
    }
}
