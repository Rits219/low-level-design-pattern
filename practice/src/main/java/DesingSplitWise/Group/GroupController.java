package DesingSplitWise.Group;

import DesingSplitWise.User.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GroupController {
    List<Group> groupList;

    public GroupController() {
        groupList = new ArrayList<>();
    }

    //crud on group.
    public void createNewGroup(String groupId, String title, User createdBy) {
        Group group = new Group(groupId, title, createdBy);
        groupList.add(group);
    }

    public void addMember(Group group, User user) {
        group.addMember(user);
    }

    public Group getGroupByGroupId(String groupId) {
        for (Group group : groupList
        ) {
            if (Objects.equals(group.getGroupId(), groupId)) {
                return group;
            }
        }
        return null;
    }
}
