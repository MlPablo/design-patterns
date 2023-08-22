package task_3_2;

import java.util.HashSet;
import java.util.Set;

public class Group {
    private final String groupName;
    private final Set<User> users;
    private final User owner;

    public Group(String groupName, User owner) {
        this.groupName = groupName;
        this.owner = owner;
        users = new HashSet<>();
        users.add(owner);
    }

    public Set<User> getUsers() {
        return users;
    }

    public User getOwner() {
        return owner;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

}
