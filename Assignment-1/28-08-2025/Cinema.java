import java.util.*;
public class Cinema {
    public static void main(String[] args) {
        int[][] seats = new int[5][10];
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter family size (0 to exit): ");
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("Exiting...");
                break;
            }
            if (n != 3) {
                System.out.println("Currently only family of 3 is supported!");
                continue;
            }
            boolean booked = false;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= 10 - n; j++) {
                    boolean available = true;
                    for (int k = 0; k < n; k++) {
                        if (seats[i][j + k] == 1) {
                            available = false;
                            break;
                        }
                    }
                    if (available) {
                        for (int k = 0; k < n; k++) {
                            seats[i][j + k] = 1;
                        }
                        System.out.println("Family of " + n + " booked seats at Row " + (i + 1)
                                + ", Seats " + (j + 1) + " - " + (j + n));
                        booked = true;
                        break;
                    }
                }
                if (booked) break;
            }
            if (!booked) {
                System.out.println("Not available for family of " + n);
            }
        }
        sc.close();
    }
}