class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", New Balance: " + balance);
    }

    synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    synchronized void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class DepositThread extends Thread {
    BankAccount account;

    DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.deposit(1000);
    }
}

class WithdrawThread extends Thread {
    BankAccount account;

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(500);
    }
}

class BalanceCheckThread extends Thread {
    BankAccount account;

    BalanceCheckThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.checkBalance();
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        DepositThread depositThread = new DepositThread(account);
        WithdrawThread withdrawThread = new WithdrawThread(account);
        BalanceCheckThread balanceCheckThread = new BalanceCheckThread(account);

        depositThread.start();
        withdrawThread.start();
        balanceCheckThread.start();

        try {
            depositThread.join();
            withdrawThread.join();
            balanceCheckThread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
