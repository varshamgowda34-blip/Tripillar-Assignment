package tripillarassignment;

public class BankAccount {

    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.accountNumber = 101;
        b.balance = 1000;

        b.deposit(500);
        b.withdraw(200);

        System.out.println("Balance: " + b.balance);
    }
}