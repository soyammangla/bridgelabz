import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] basicSalary = new int[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("\nEnter name of employee " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter basic salary of " + names[i] + ": ");
            basicSalary[i] = sc.nextInt();
        }

        System.out.println("\n----- Employee Salary Slips -----\n");

        for (int i = 0; i < n; i++) {
            double hra = 0.20 * basicSalary[i];
            double da = 0.10 * basicSalary[i];
            double gross = basicSalary[i] + hra + da;

            double tax = 0;
            if (gross > 50000) {
                tax = 0.10 * gross;
            }

            double netSalary = gross - tax;

            System.out.println("Employee: " + names[i]);
            System.out.println("Basic Salary: " + basicSalary[i]);
            System.out.println("HRA (20%): " + hra);
            System.out.println("DA (10%): " + da);
            System.out.println("Gross Salary: " + gross);
            System.out.println("Tax: " + tax);
            System.out.println("Net Salary: " + netSalary);
            System.out.println("-----------------------------------");
        }
        sc.close();
    }
}
