import java.util.Scanner;

public class Fitness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean keepRunning = true;

        do {
            System.out.print("Enter number of members to register: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("\n--- Register Member " + i + " ---");
                System.out.println("Select Membership Type:");
                System.out.println("1. Monthly (₹1000)");
                System.out.println("2. Quarterly (₹2500)");
                System.out.println("3. Yearly (₹9000)");
                int choice = sc.nextInt();

                int fee = 0;
                switch (choice) {
                    case 1:
                        fee = 1000;
                        break;
                    case 2:
                        fee = 2500;
                        break;
                    case 3:
                        fee = 9000;
                        break;
                    default:
                        System.out.println("Invalid choice! Defaulting to Monthly.");
                        fee = 1000;
                }

                System.out.print("Are you a student or senior citizen? (yes/no): ");
                String discountStatus = sc.next();

                if (discountStatus.equalsIgnoreCase("yes")) {
                    fee = (int) (fee * 0.8);
                    System.out.println("Discount applied! New fee: " + fee);
                } else {
                    System.out.println("No discount applied. Fee: " + fee);
                }
            }

            System.out.print("\nDo you want to continue registering? (yes/no): ");
            String ans = sc.next();
            if (ans.equalsIgnoreCase("no")) {
                keepRunning = false;
            }

        } while (keepRunning);

        System.out.println("\nGym registration closed. Thank you!");
        sc.close();
    }
}
