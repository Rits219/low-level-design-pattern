package DesingSplitWise;

import java.util.HashMap;
import java.util.Map;

public class UserBalanceSheet {
    private Map<String, Balance> userVsBalance;
    private double totalOweAmount;
    private double totalGetBackAmount;

    public UserBalanceSheet() {
        this.userVsBalance = new HashMap<>();
        this.totalOweAmount = 0;
        this.totalGetBackAmount = 0;
    }

    public void setUserVsBalance(Map<String, Balance> userVsBalance) {
        this.userVsBalance = userVsBalance;
    }

    public Map<String, Balance> getUserVsBalance() {
        return userVsBalance;
    }

    public double getTotalGetBackAmount() {
        return totalGetBackAmount;
    }

    public void setTotalOweAmount(double totalOweAmount) {
        this.totalOweAmount = totalOweAmount;
    }

    public void setTotalGetBackAmount(double totalGetBackAmount) {
        this.totalGetBackAmount = totalGetBackAmount;
    }

    public double getTotalOweAmount() {
        return totalOweAmount;
    }

    public void display() {
        System.out.println("user vs balance is -------");
        System.out.println("iterating user vs balance start -----");
        for (String userId : userVsBalance.keySet()
        ) {
            System.out.println("userId: " + userId + ",totalOweAmount: " + userVsBalance.get(userId).getTotalOweAmount() +
                    ",totalGetBackAmount: " + userVsBalance.get(userId).getTotalGetBackAmount());
        }
        System.out.println("iterating user vs balance end -----");
        System.out.println("total owe amount is " + this.totalOweAmount);
        System.out.println("total get back amount is " + this.totalGetBackAmount);
    }
}

