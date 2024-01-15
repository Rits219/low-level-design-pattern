package DesingSplitWise.Expense.Split;

import DesingSplitWise.SplitType;

public class SplitFactory {
    public static ExpenseSplit getExpenseSplit(SplitType splitType) {
        switch (splitType) {
            case EQUAL -> {
                return new EqualExpenseSplit();
            }
            case UNEQUAL -> {
                return new UnequalExpenseSplit();
            }
            case PERCENTAGE -> {
                return new PercentageExpenseSplit();
            }
        }
        return new EqualExpenseSplit();
    }
}
