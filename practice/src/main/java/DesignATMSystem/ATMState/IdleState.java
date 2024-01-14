package DesignATMSystem.ATMState;

import DesignATMSystem.ATM;
import DesignATMSystem.Card;

public class IdleState extends ATMState {
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("card is inserted into atm");
        atm.setAtmState(new HasCardSate());
    }
}
