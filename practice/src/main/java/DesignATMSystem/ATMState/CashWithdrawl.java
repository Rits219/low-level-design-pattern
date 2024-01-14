package DesignATMSystem.ATMState;

import DesignATMSystem.ATM;
import DesignATMSystem.Card;
import DesignATMSystem.CashWithdrawlProcessor.CashWithdrawlProcessor;
import DesignATMSystem.CashWithdrawlProcessor.HundredCashWithdrawlProcessor;
import DesignATMSystem.CashWithdrawlProcessor.TwoHundredCashWithdrawlProcessor;
import DesignATMSystem.CashWithdrawlProcessor.fiftyCashWithdrawalProcessor;

public class CashWithdrawl extends ATMState {
    @Override
    public void cashWithdrawl(ATM atm, Card card, double amount) throws Exception {
        //check user balance.
        if (card.getBalance() < amount) {
            System.out.println("Insufficient amount in user account");
            exit(atm);
            return;
        }

        //check atm balance
        if (atm.getBalance() < amount) {
            System.out.println("Insufficient amount in atm");
            exit(atm);
            return;
        }

        //assuming that we do not need to implement chain responsibiliy principle.
        CashWithdrawlProcessor withdrawlProcessor = new TwoHundredCashWithdrawlProcessor(
                new HundredCashWithdrawlProcessor(new fiftyCashWithdrawalProcessor(null)));
        try {
            withdrawlProcessor.cashWithdraw(atm, amount);
        } catch (Exception e) {
            System.out.println("some exception while withdrawing from atm");
            System.out.println("perform roll back!!");
            throw e;
        }
        card.withdrawAmount(amount);
        System.out.println("successfully withdraw amount");
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
