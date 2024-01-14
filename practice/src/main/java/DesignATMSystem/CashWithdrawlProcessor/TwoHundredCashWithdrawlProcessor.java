package DesignATMSystem.CashWithdrawlProcessor;

import DesignATMSystem.ATM;

public class TwoHundredCashWithdrawlProcessor extends CashWithdrawlProcessor {

    public TwoHundredCashWithdrawlProcessor(CashWithdrawlProcessor nextCashWithdrawalProcessor) {
        super(nextCashWithdrawalProcessor);
    }

    @Override
    public void cashWithdraw(ATM atm, double amount) throws Exception {
        int requiredNumberOfNotes = (int) amount / 200;
        double remainingAmount = amount;
        int usedNotes;
        if (atm.getTwoHundredRsNotes() <= requiredNumberOfNotes) {
            usedNotes = atm.getTwoHundredRsNotes();
            atm.setTwoHundredRsNotes(requiredNumberOfNotes - usedNotes);
        } else {
            usedNotes = requiredNumberOfNotes;
            atm.setTwoHundredRsNotes(atm.getTwoHundredRsNotes() - requiredNumberOfNotes);
        }
        double usedAmount = 200 * usedNotes;
        remainingAmount = remainingAmount - usedAmount;
        atm.withdrawAmount(usedAmount);

        if (remainingAmount > 0) {
            super.cashWithdraw(atm, amount);
        }
    }
}
