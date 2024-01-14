package DesignATMSystem.CashWithdrawlProcessor;

import DesignATMSystem.ATM;

public class fiftyCashWithdrawalProcessor extends CashWithdrawlProcessor {
    public fiftyCashWithdrawalProcessor(CashWithdrawlProcessor nextCashWithdrawalProcessor) {
        super(nextCashWithdrawalProcessor);
    }

    @Override
    public void cashWithdraw(ATM atm, double amount) throws Exception {
        int requiredNumberOfNotes = (int) amount / 50;
        double remainingAmount = amount;
        int usedNotes;
        if (atm.getTwoHundredRsNotes() <= requiredNumberOfNotes) {
            usedNotes = atm.getTwoHundredRsNotes();
            atm.setTwoHundredRsNotes(requiredNumberOfNotes - usedNotes);
        } else {
            usedNotes = requiredNumberOfNotes;
            atm.setTwoHundredRsNotes(atm.getFiftyRsNotes() - requiredNumberOfNotes);
        }
        double usedAmount = 50 * usedNotes;
        remainingAmount = remainingAmount - usedAmount;
        atm.withdrawAmount(usedAmount);

        if (remainingAmount > 0) {
            super.cashWithdraw(atm, amount);
        }
    }
}
