package DesingSplitWise;

import DesingSplitWise.Expense.Split.Split;
import DesingSplitWise.User.User;

import java.util.List;
import java.util.Map;

public class BalanceSheetController {

    public void updateUserBalanceSheet(List<Split> splitList, User paidBy, double amount) {
        UserBalanceSheet paidByUserBalanceSheet = paidBy.getUserBalanceSheet();
        Map<String, Balance> paidByUserBalanceSheetMap = paidByUserBalanceSheet.getUserVsBalance();
        for (Split split : splitList) {
            User friend = split.getUser();
            if (friend == paidBy) {
                continue;
            }
            //update paid by user object.
            Balance balance = paidByUserBalanceSheetMap.getOrDefault(friend.getUserId(), new Balance());
            balance.setTotalGetBackAmount(balance.getTotalGetBackAmount() + split.getAmount());
            paidByUserBalanceSheetMap.put(friend.getUserId(), balance);
            paidByUserBalanceSheet.setTotalGetBackAmount(paidByUserBalanceSheet.getTotalGetBackAmount() + split.getAmount());

            //calculation on friend balance sheet
            UserBalanceSheet friendBalanceSheet = friend.getUserBalanceSheet();
            Map<String, Balance> friendBalanceSheetMap = friendBalanceSheet.getUserVsBalance();
            balance = friendBalanceSheetMap.getOrDefault(paidBy.getUserId(), new Balance());
            balance.setTotalOweAmount(balance.getTotalOweAmount() + split.getAmount());
            friendBalanceSheetMap.put(paidBy.getUserId(), balance);
            friendBalanceSheet.setTotalOweAmount(friendBalanceSheet.getTotalOweAmount() + split.getAmount());
            friend.setUserBalanceSheet(friendBalanceSheet);

        }
        paidByUserBalanceSheet.setUserVsBalance(paidByUserBalanceSheetMap);
        paidBy.setUserBalanceSheet(paidByUserBalanceSheet);
    }
}
