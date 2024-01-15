package DesingSplitWise;

import DesingSplitWise.Expense.ExpenseController;
import DesingSplitWise.Expense.Split.Split;
import DesingSplitWise.Group.Group;
import DesingSplitWise.Group.GroupController;
import DesingSplitWise.User.User;
import DesingSplitWise.User.UserController;

import java.util.List;

public class SplitsWise {
    UserController userController;
    GroupController groupController;

    ExpenseController expenseController;

    public void initialize() {
        this.userController = new UserController();
        this.groupController = new GroupController();
        this.expenseController = new ExpenseController();
    }


    public static void main(String[] args) throws Exception {
        SplitsWise splitsWise = new SplitsWise();
        splitsWise.initialize();

        User ritesh = new User("1", "Ritesh");
        User sawan = new User("2", "Sawan");
        User piyush = new User("3", "Piyush");
        splitsWise.userController.addUser(ritesh);
        splitsWise.userController.addUser(sawan);
        splitsWise.userController.addUser(piyush);

        splitsWise.userController.getUserByUserId("1").displayUser();

        splitsWise.groupController.createNewGroup("1", "ritesh_sawan", ritesh);
        splitsWise.groupController.addMember(splitsWise.groupController.getGroupByGroupId("1"), splitsWise.userController.getUserByUserId("2"));

        try {
            splitsWise.groupController.getGroupByGroupId("1").addExpense("1", SplitType.EQUAL, List.of(new Split(ritesh, 50), new Split(sawan, 50)), ritesh, 100);
        } catch (Exception e) {
            System.out.println("not able to create expense");
        }
        splitsWise.userController.getUserByUserId("1").displayUser();

        splitsWise.expenseController.createExpense("2", SplitType.EQUAL,
                List.of(new Split(splitsWise.userController.getUserByUserId("1"), 50),
                        new Split(splitsWise.userController.getUserByUserId("3"), 50)),
                piyush, 100);

        splitsWise.userController.getUserByUserId("1").displayUser();
        splitsWise.userController.getUserByUserId("2").displayUser();
        splitsWise.userController.getUserByUserId("3").displayUser();
    }
}
