import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;

            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

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
