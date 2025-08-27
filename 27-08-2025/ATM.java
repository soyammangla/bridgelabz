
import java.util.*;

public class ATM {

  public static void main(String[] args) {
    int[] arr = { 200, -500, 1000, 200, 700 };
    int balance = processTransactions(arr);
    System.out.println("Final balance: " + balance);
    if (balance < 0) {
      System.out.println("overdraft");
    }
  }

  public static int processTransactions(int[] arr) {
    int balance = 0;
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        balance += arr[i];
      } else {
        System.out.println("Do you want to withdraw " + (-arr[i]) + "? (yes/no)");
        String response = input.nextLine();
        if (response.equalsIgnoreCase("yes")) {
          balance += arr[i];
        } else {
          System.out.println("Withdrawal skipped.");
        }
      }
    }
    input.close();
    return balance;
  }

}
