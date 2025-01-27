class BankAccount {
    int balance = 10000;

    synchronized void withdraw(String name, int amount) {
        if (balance >= amount) {
            System.out.println(name + " is withdrawing: " + amount);
            balance -= amount;
            System.out.println(name + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(name + " tried to withdraw " + amount + " but insufficient balance.");
        }
    }
}

class Customer extends Thread {
    BankAccount account;
    String name;
    int amount;

    Customer(BankAccount account, String name, int amount) {
        this.account = account;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(name, amount);
    }
}

public class SynchronizedBankExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        Customer c1 = new Customer(account, "Zohaib", 7000);
        Customer c2 = new Customer(account, "Rajesh", 6000);

        c1.start();
        c2.start();
    }
}
