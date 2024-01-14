package DesignATMSystem.ATMState;

import DesignATMSystem.ATM;
import DesignATMSystem.ATMOperation;

public class SelectionState extends ATMState {
    @Override
    public void selectOperation(ATM atm, ATMOperation operation) {
        switch (operation) {
            case CHECK_BALANCE -> {
                System.out.println("user selected check balance operation");
                atm.setAtmState(new CheckBalance());
            }
            case CASH_WITHDRAWL -> {
                System.out.println("user selected cash withdrawl operation");
                atm.setAtmState(new CashWithdrawl());
            }
        }
    }
}
