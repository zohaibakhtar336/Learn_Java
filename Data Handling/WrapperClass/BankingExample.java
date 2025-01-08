import java.util.Scanner;

public class BankingExample {
    private String accountNumber;
    private String accountHolderName;
    private Double balance;

    public BankingExample(String accountNumber, String accountHolderName, Double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(Double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully! New Balance: " + balance);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    public void withdraw(Double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully! New Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankingExample account = new BankingExample("123456789", "Zohaib Akhtar", 7000.00);
        account.displayAccountDetails();

        System.out.print("\nEnter amount to deposit: ");
        Double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("\nEnter amount to withdraw: ");
        Double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        account.displayAccountDetails();
        sc.close();
    }
}
