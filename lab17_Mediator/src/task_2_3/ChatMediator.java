package task_2_3;

import java.util.HashMap;

public class ChatMediator implements Mediator {
    private final HashMap<String, User> users;

    public ChatMediator() {
        users = new HashMap<>();
    }

    @Override
    public void notify(User user, String message, String userTo, String action) {
        switch (action) {
            case "addUser" -> addUser(user);
            case "sendMessageAll" -> sendMessageAll(message, user);
            case "sendMessage" -> sendMessage(message, userTo, user);
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
}
