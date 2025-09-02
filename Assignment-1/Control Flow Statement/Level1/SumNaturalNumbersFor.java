import java.util.Scanner;

public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;

            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both computations match ✔");
            } else {
                System.out.println("Mismatch ❌");
            }
        } else {
            System.out.println("Not a natural number");
        }

        sc.close();
    }
}
