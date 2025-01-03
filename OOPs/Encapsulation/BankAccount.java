public class BankAccount {
    // Private field for balance (data hiding)
    private double balance;

    // Constructor to set initial balance
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            balance = initialBalance; // Set balance if positive
        } else {
            System.out.println("Initial balance must be positive.");
        }
    }

    // Getter method to get current balance
    public double getBalance() {
        return balance; // Return current balance
    }

    // Method to deposit money into account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Add amount to balance
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Subtract amount from balance
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        // Create a new account
        BankAccount account = new BankAccount(1000.0);

        // Display balance
        System.out.println("Current Balance: " + account.getBalance());

        // Deposit money
        account.deposit(500.0);
        System.out.println("After Deposit, Balance: " + account.getBalance());

        // Withdraw money
        account.withdraw(200.0);
        System.out.println("After Withdrawal, Balance: " + account.getBalance());

        // Invalid withdrawal
        account.withdraw(1500.0); // Error: insufficient funds
    }
}
