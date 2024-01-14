package DesignATMSystem;

public class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdrawAmount(double amount) {
        balance = balance - amount;
    }
}
