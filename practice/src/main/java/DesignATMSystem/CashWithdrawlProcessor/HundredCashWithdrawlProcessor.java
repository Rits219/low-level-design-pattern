package DesignATMSystem.CashWithdrawlProcessor;

import DesignATMSystem.ATM;

public class HundredCashWithdrawlProcessor extends CashWithdrawlProcessor{
    public HundredCashWithdrawlProcessor(CashWithdrawlProcessor nextCashWithdrawalProcessor) {
        super(nextCashWithdrawalProcessor);
    }

    @Override
    public void cashWithdraw(ATM atm, double amount) throws Exception {
        int requiredNumberOfNotes = (int) amount / 100;
        double remainingAmount = amount;
        int usedNotes;
        if (atm.getTwoHundredRsNotes() <= requiredNumberOfNotes) {
            usedNotes = atm.getTwoHundredRsNotes();
            atm.setTwoHundredRsNotes(requiredNumberOfNotes - usedNotes);
        } else {
            usedNotes = requiredNumberOfNotes;
            atm.setTwoHundredRsNotes(atm.getTwoHundredRsNotes() - requiredNumberOfNotes);
        }
        double usedAmount = 100 * usedNotes;
        remainingAmount = remainingAmount - usedAmount;
        atm.withdrawAmount(usedAmount);

        if (remainingAmount > 0) {
            super.cashWithdraw(atm, amount);
        }
    }
}
