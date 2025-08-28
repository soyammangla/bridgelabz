package Strings.Level1;

import java.util.Scanner;

public class IllegalArguments {

    public static void generateException(String text) {
        System.out.println("Substring: " + text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) { 
            System.out.println("Caught RuntimeException: " + e);
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
