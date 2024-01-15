package DesingSplitWise.Expense.Split;

import java.util.List;

public interface ExpenseSplit {
    public boolean validateRequest(double amount, List<Split> splitList);
}
