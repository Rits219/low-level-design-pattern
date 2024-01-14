package DesignATMSystem.ATMState;

import DesignATMSystem.ATM;
import DesignATMSystem.ATMOperation;
import DesignATMSystem.Card;

public abstract class ATMState {
    public void insertCard(ATM atm, Card card) {
        System.out.println("something went wrong!!");
    }

    public void authenticatePin(ATM atm, Card card, int pinNumber) {
        System.out.println("something went wrong!!");
    }

    public void selectOperation(ATM atm, ATMOperation operation) {
        System.out.println("something went wrong!!");
    }

    public void checkBalance(ATM atm, Card card) {
        System.out.println("somthing went wrong!!");
    }

    public void cashWithdrawl(ATM atm, Card card, double amount) throws Exception {
        System.out.println("something wen wrong!!");
    }

    public void exit(ATM atm) {
        System.out.println("something wen wrong!!");
    }

    public void returnCard() {
        System.out.println("something went wrong!!");
    }
}
