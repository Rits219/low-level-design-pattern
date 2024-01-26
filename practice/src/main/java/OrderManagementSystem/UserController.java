package OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> userList;

    public UserController() {
        this.userList = new ArrayList<>();
    }


    //add user in system
    public void addUser(User user) {
        userList.add(user);
    }

    //remove user from system
    public void removeUser(User user) {
        userList.remove(user);
    }

    //get user from system
    public User getUser(int userId) {
        for (User user : userList
        ) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }
}
