package DesingSplitWise.Expense;

import DesingSplitWise.BalanceSheetController;
import DesingSplitWise.Expense.Split.ExpenseSplit;
import DesingSplitWise.Expense.Split.Split;
import DesingSplitWise.Expense.Split.SplitFactory;
import DesingSplitWise.SplitType;
import DesingSplitWise.User.User;

import java.util.List;

public class ExpenseController {

    //crud on expense;
    BalanceSheetController balanceSheetController;

    public ExpenseController(BalanceSheetController balanceSheetController) {
        this.balanceSheetController = balanceSheetController;
    }

    public ExpenseController() {
        this.balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, SplitType splitType, List<Split> splitList, User paidBy, double amount) throws Exception {
        //validate the request.
        ExpenseSplit expenseSplit = SplitFactory.getExpenseSplit(splitType);
        if (!expenseSplit.validateRequest(amount, splitList)) {
            throw new Exception("invalid request");
        }
        Expense expense = new Expense(expenseId, splitType, splitList, paidBy, amount);
        this.balanceSheetController.updateUserBalanceSheet(splitList, paidBy, amount);
        return expense;
    }
}
