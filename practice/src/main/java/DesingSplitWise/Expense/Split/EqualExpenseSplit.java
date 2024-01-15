package DesingSplitWise.Expense.Split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {
    @Override
    public boolean validateRequest(double amount, List<Split> splitList) {
        return splitList.stream()
                .mapToDouble(split -> split.amount)
                .sum() == amount;
    }
}
