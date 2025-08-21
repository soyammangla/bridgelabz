import java.util.Scanner;

public class AllChar {

    // Method to return characters of a string without using toCharArray()
    public static char[] customToCharArray(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Get char array using custom method
        char[] customArray = customToCharArray(text);

        // Get char array using built-in toCharArray()
        char[] builtInArray = text.toCharArray();

        // Compare both arrays
        boolean comparisonResult = compareCharArrays(customArray, builtInArray);

        // Display results
        System.out.print("Custom char array: ");
        for (char c : customArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Built-in char array: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are both arrays equal? " + comparisonResult);

        sc.close();
    }
}
