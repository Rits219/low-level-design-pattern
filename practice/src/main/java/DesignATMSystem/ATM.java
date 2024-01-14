package DesignATMSystem;

import DesignATMSystem.ATMState.ATMState;

public class ATM {
    ATMState atmState;
    double balance;

    int twoHundredRsNotes;
    int hundredRsNotes;
    int fiftyRsNotes;

    public void setFiftyRsNotes(int fiftyRsNotes) {
        this.fiftyRsNotes = fiftyRsNotes;
    }

    public void setHundredRsNotes(int hundredRsNotes) {
        this.hundredRsNotes = hundredRsNotes;
    }

    public void setTwoHundredRsNotes(int twoHundredRsNotes) {
        this.twoHundredRsNotes = twoHundredRsNotes;
    }

    public int getFiftyRsNotes() {
        return fiftyRsNotes;
    }

    public int getHundredRsNotes() {
        return hundredRsNotes;
    }

    public int getTwoHundredRsNotes() {
        return twoHundredRsNotes;
    }

    public void displayAtm() {
        System.out.println("atm state is " + atmState);
        System.out.println("atm balance is " + balance);
        System.out.println("two hundred rs. notes " + twoHundredRsNotes);
        System.out.println("hundred rs. notes " + hundredRsNotes);
        System.out.println("fifty rs. notes " + fiftyRsNotes);
    }

    public ATM(ATMState state, double balance, int twoHundredRsNotes, int hundredRsNotes, int fiftyRsNotes) {
        this.atmState = state;
        this.balance = balance;
        this.twoHundredRsNotes = twoHundredRsNotes;
        this.hundredRsNotes = hundredRsNotes;
        this.fiftyRsNotes = fiftyRsNotes;
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public double getBalance() {
        return balance;
    }

    public void withdrawAmount(double amount) {
        this.balance = balance - amount;
    }
}
