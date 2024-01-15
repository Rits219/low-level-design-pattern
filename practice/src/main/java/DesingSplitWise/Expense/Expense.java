package DesingSplitWise.Expense;

import DesingSplitWise.Expense.Split.Split;
import DesingSplitWise.SplitType;
import DesingSplitWise.User.User;

import java.util.List;

public class Expense {
    private String expenseId;
    private SplitType splitType;
    private List<Split> splitList;
    private User paidBy;
    private double amount;

    public Expense(String expenseId, SplitType splitType, List<Split> splitList, User paidBy, double amount) {
        this.expenseId = expenseId;
        this.splitType = splitType;
        this.splitList = splitList;
        this.paidBy = paidBy;
        this.amount = amount;
    }
}
