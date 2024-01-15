package DesingSplitWise.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserController {
    List<User> userList;

    public UserController() {
        this.userList = new ArrayList<>();
    }

    //crud operation on user in splitwise.
    public void addUser(User user) {
        userList.add(user);
    }

    public User getUserByUserId(String userId) {
        for (User user : userList
        ) {
            if (Objects.equals(user.getUserId(), userId)) {
                return user;
            }
        }
        return null;
    }
}
