import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLOYEES = 10; // Zara ke employees
        double[] salary = new double[EMPLOYEES];
        double[] years = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input salaries and years of service
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            double s = sc.nextDouble();
            System.out.print("Enter Years of Service: ");
            double y = sc.nextDouble();

            // Validation
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // retry for same employee
                continue;
            }

            salary[i] = s;
            years[i] = y;
        }

        // Calculate bonus and new salary
        for (int i = 0; i < EMPLOYEES; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\n--------------------------------------------");
        System.out.println("Zara Employee Bonus Report");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\n********** Totals **********");
        System.out.printf("Total Old Salary = %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout = %.2f\n", totalBonus);
        System.out.printf("Total New Salary = %.2f\n", totalNewSalary);

        sc.close();
    }
}
