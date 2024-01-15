package DesingSplitWise.User;

import DesingSplitWise.UserBalanceSheet;

public class User {
    private String userId;
    private String userName;
    UserBalanceSheet userBalanceSheet;

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.userBalanceSheet = new UserBalanceSheet();
    }

    public UserBalanceSheet getUserBalanceSheet() {
        return userBalanceSheet;
    }

    public void setUserBalanceSheet(UserBalanceSheet userBalanceSheet) {
        this.userBalanceSheet = userBalanceSheet;
    }

    public String getUserId() {
        return userId;
    }

    public void displayUser() {
        System.out.println("user name is " + this.userName);
        userBalanceSheet.display();
    }
}
