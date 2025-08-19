import java.util.Scanner;

public class Fee2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking double inputs
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();

        // Operator precedence demonstration
        double result1 = a + b * c;    // b*c done first, then + a
        double result2 = a * b + c;    // a*b done first, then + c
        double result3 = c + a / b;    // a/b done first (double division), then + c
        double result4 = a % b + c;    // a%b done first, then + c

        System.out.println("The results of Double Operations are " 
            + result1 + ", " + result2 + ", " + result3 + ", " + result4);

        sc.close();
    }
}
