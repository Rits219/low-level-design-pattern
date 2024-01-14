package DesignATMSystem.CashWithdrawlProcessor;

import DesignATMSystem.ATM;

public abstract class CashWithdrawlProcessor {
    CashWithdrawlProcessor nextCashWithdraw;

    public CashWithdrawlProcessor(CashWithdrawlProcessor cashWithdrawlProcessor) {
        this.nextCashWithdraw = cashWithdrawlProcessor;
    }

    public void cashWithdraw(ATM atm, double amount) throws Exception {
        if (nextCashWithdraw != null) {
            nextCashWithdraw.cashWithdraw(atm, amount);
        } else {
            throw new Exception("some exception occured!");
        }
    }
}
