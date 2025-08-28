import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take number as input
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        // Step 2: Find number of digits
        String str = String.valueOf(num);
        int n = str.length();

        // Step 3: Store digits in an array
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = str.charAt(i) - '0';
        }

        // Step 4: Create frequency array of size 10
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        // Step 5: Display frequency of each digit
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}
