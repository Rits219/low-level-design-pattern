package DesignATMSystem.ATMState;

import DesignATMSystem.ATM;
import DesignATMSystem.Card;

public class CheckBalance extends ATMState {
    @Override
    public void checkBalance(ATM atm, Card card) {
        System.out.println(card.getBalance());
        exit(atm);
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setAtmState(new IdleState());
        System.out.println("exited!!");
    }

    @Override
    public void returnCard() {
        System.out.println("card is returned!");
    }
}
