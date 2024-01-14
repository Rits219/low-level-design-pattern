package DesignATMSystem.ATMState;

import DesignATMSystem.ATM;
import DesignATMSystem.Card;

public class HasCardSate extends ATMState {
    @Override
    public void authenticatePin(ATM atm, Card card, int pinNumber) {
        if (card.authenticatePin(pinNumber)) {
            System.out.println("pin autheticated successfully!!");
            atm.setAtmState(new SelectionState());
        } else {
            exit(atm);
        }
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
