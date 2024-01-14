package DesignATMSystem;

public class Card {
    int cvv;
    int pinNumber;
    int cardNumber;
    BankAccount account;

    public Card(int cvv, int cardNumber, int pinNumber, BankAccount account) {
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.pinNumber = pinNumber;
        this.account = account;
    }

    public boolean authenticatePin(int pinNumber) {
        return this.pinNumber == pinNumber;
    }

    public BankAccount getAccount() {
        return account;
    }

    public double getBalance() {
        return account.getBalance();
    }

    public void withdrawAmount(double amount) {
        account.withdrawAmount(amount);
    }
}
