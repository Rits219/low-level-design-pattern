package DesingSplitWise.Group;

import DesingSplitWise.Expense.Expense;
import DesingSplitWise.Expense.ExpenseController;
import DesingSplitWise.Expense.Split.Split;
import DesingSplitWise.SplitType;
import DesingSplitWise.User.User;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupId;
    private String title;
    private User createdBy;
    List<User> groupMembers;
    List<Expense> expenseList;
    ExpenseController expenseController;

    public String getGroupId() {
        return groupId;
    }

    public Group(String groupId, String title, User createdBy) {
        this.groupId = groupId;
        this.title = title;
        this.groupMembers = new ArrayList<>();
        this.expenseList = new ArrayList<>();
        this.createdBy = createdBy;
        this.expenseController = new ExpenseController();
    }

    public void addMember(User user) {
        groupMembers.add(user);
    }

    public void addExpense(String expenseId, SplitType splitType, List<Split> splitList, User paidBy, double amount) throws Exception {
        expenseList.add(expenseController.createExpense(expenseId, splitType, splitList, paidBy, amount));
    }
}
