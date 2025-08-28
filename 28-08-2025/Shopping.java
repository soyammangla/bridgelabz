import java.util.Scanner;
public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean moreCustomers = true;
        while (moreCustomers) {
            double totalAmount = 0;
            int n = 0;
            while (n < 1) {
                System.out.print("How many products do you want to add? (at least 1): ");
                n = sc.nextInt();
            }
            for(int i=1;i<=n;i++) {
                System.out.println("\nSelect product " + i + ":");
                System.out.println("1. Laptop - Rs 30000");
                System.out.println("2. Mobile - Rs 20000");
                System.out.println("3. Headphones - Rs 2000");
                System.out.println("4. Smartwatch - Rs 5000");
                System.out.println("5. Charger - Rs 500");
                System.out.println("6: Earbuds - Rs 1200");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        totalAmount = totalAmount + 30000;
                        break;
                    case 2: 
                        totalAmount = totalAmount + 20000;
                        break;
                    case 3:
                        totalAmount = totalAmount + 2000;
                        break;
                    case 4:
                        totalAmount = totalAmount + 5000;
                        break;
                    case 5:
                        totalAmount = totalAmount + 500;
                        break;
                    case 6:
                        totalAmount = totalAmount + 1200;
                        break;
                    default:
                    System.out.println("invalid choice");
                    i--;
                    break;
                }
            }           
            if (totalAmount > 5000) {
                double discount = totalAmount * 0.25; 
                totalAmount -= discount;
                System.out.println("\nCongratulations! You got a 25% discount: Rs " + discount);
            }
            System.out.println("Total amount to pay is " + totalAmount);
            System.out.print("\nIs there another customer (true/false): ");
            moreCustomers = sc.nextBoolean();
        }
        sc.close();
    }
}