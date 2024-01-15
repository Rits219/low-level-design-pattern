package DesingSplitWise.Expense.Split;

import java.util.List;

public class PercentageExpenseSplit implements ExpenseSplit {
    @Override
    public boolean validateRequest(double amount, List<Split> splitList) {
        double sum = splitList.stream()
                .mapToDouble(split -> split.percentage)
                .sum();
        return sum == 100;
    }
}
