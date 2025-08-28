package Strings.Level1;

import java.util.Scanner;

public class ArrayIndexOutOfBounds {

    public static void generateException(String[] names) {

        System.out.println("Accessing index " + names.length + ": " + names[names.length]);
    }


    public static void handleException(String[] names) {
        try {
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

        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        String[] names = new String[size];

        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        System.out.println("\n---- Generating Exception ----");
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Program crashed here with exception: " + e);
        }

        System.out.println("\n---- Handling Exception ----");
        handleException(names);

        sc.close();
    }
}
