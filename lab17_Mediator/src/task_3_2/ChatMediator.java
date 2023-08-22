package task_3_2;

import java.util.HashMap;

public class ChatMediator implements Mediator {
    private final HashMap<String, User> users;
    private final HashMap<String, Group> groups;

    public ChatMediator() {
        users = new HashMap<>();
        groups = new HashMap<>();
    }

    @Override
    public void notify(User user, String message, String userTo, String action) {
        switch (action) {
            case "addUser" -> addUser(user);
            case "sendMessageAll" -> sendMessageAll(message, user);
            case "sendMessage" -> sendMessage(message, userTo, user);
            case "createGroup" -> createGroup(user, message);
            case "addUserToGroup" -> addUserToGroup(user, message, userTo);
            case "removeUserFromGroup" -> removeUserFromGroup(user, message, userTo);
            case "sendMessageToGroup" -> sendMessageToGroup(user, message, userTo);
            default -> System.out.println("Unknown action");
        }
    }

    private void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    private void sendMessageAll(String message, User userFrom) {
        if (userFrom == null) return;
        for (User userTo : users.values()) {
            if (!userTo.getUserId().equals(userFrom.getUserId())) {
                userTo.receiveMassage(message, userFrom.getUserId());
            }
        }
    }

    private void sendMessage(String message, String userTo, User userFrom) {
        if (userFrom == null) return;
        users.get(userTo).receiveMassage(message, userFrom.getUserId());
    }

    private void createGroup(User user, String groupName) {
        groups.put(groupName, new Group(groupName, user));
    }

    private void addUserToGroup(User user, String groupName, String userId) {
        User userTo = users.get(userId);
        Group group = groups.get(groupName);
        if (group == null || userTo == null) {
            System.out.println("Group " + groupName + " or user " + userId + " does not exist");
            return;
        }
        if (user == group.getOwner()) {
            group.addUser(userTo);
        }
        else {
            System.out.println("Access denied: " + user.getUserId() + " is not the owner of the group " + groupName);
        }
    }

    private void removeUserFromGroup(User user, String groupName, String userId) {
        User userTo = users.get(userId);
        Group group = groups.get(groupName);
        if (group == null || userTo == null) {
            System.out.println("Group " + groupName + " or user " + userId + " does not exist");
            return;
        }
        if (user == group.getOwner()) {
            group.removeUser(userTo);
        }
        else {
            System.out.println("Access denied: " + user.getUserId() + " is not the owner of the group " + groupName);
        }
    }

    private void sendMessageToGroup(User userFrom, String message, String groupName) {
        Group group = groups.get(groupName);
        String userFromId = userFrom.getUserId();
        if (group != null) {
            group.getUsers().forEach(user -> {
                if (!user.getUserId().equals(userFromId)) {
                    user.receiveMassage(message, userFromId);
                }
            });
        }
        else {
            System.out.println("Group " + groupName + " does not exist");
        }
    }
}
