package Strings.Level1;
import java.util.Scanner;

public class StringIndexOutOfBounds {

    public static void generateException(String text) {
        System.out.println("Character at index " + text.length() + " : " + text.charAt(text.length()));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Character at index " + text.length() + " : " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("You tried to access an invalid index. Valid range is 0 to " + (text.length() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\n---- Generating Exception ----");
        try {
            generateException(text); 
        } catch (Exception e) {
            System.out.println("Program crashed here with exception: " + e);
        }

        System.out.println("\n---- Handling Exception ----");
        handleException(text);

        sc.close();
    }
}
