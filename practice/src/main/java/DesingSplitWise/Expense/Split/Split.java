package DesingSplitWise.Expense.Split;

import DesingSplitWise.User.User;

public class Split {
    User user;
    double amount;
    double percentage;

    public Split(User user, double amount) {
        this.user = user;
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public double getAmount() {
        return amount;
    }
}
