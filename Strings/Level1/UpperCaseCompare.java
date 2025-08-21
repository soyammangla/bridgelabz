import java.util.Scanner;

public class UpperCaseCompare {

    // Method to convert text to uppercase using charAt()
    public static String convertToUppercase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // If lowercase, convert to uppercase by subtracting 32
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch; // Keep as is
            }
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take complete line input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Convert using custom method
        String customUpper = convertToUppercase(text);

        // Convert using built-in method
        String builtInUpper = text.toUpperCase();

        // Compare both
        boolean areEqual = compareUsingCharAt(customUpper, builtInUpper);

        // Display results
        System.out.println("\nOriginal text: " + text);
        System.out.println("Custom Uppercase: " + customUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both results equal? " + areEqual);

        sc.close();
    }
}
