public class BankAccount {
    // Static variable
    private static int totalAccounts = 0;
    
    // Instance variables
    private final int accountNumber;
    private String accountHolderName;
    private static final String bankName = "SBI"; // Example bank name
    
    // Static method to get total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Constructor using 'this'
    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    // Method to display account details
    public void displayDetails() {
        if (this instanceof BankAccount) {  // though redundant
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder Name: " + accountHolderName);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Rahul");
        BankAccount acc2 = new BankAccount(102, "Priya");

        acc1.displayDetails();
        acc2.displayDetails();

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
