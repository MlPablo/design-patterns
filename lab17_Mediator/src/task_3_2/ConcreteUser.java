package task_3_2;

public class ConcreteUser implements User {

    final private String userId;
    private final Mediator mediator;

    public ConcreteUser(String userId, Mediator mediator) {
        this.userId = userId;
        this.mediator = mediator;
        mediator.notify(this, null, null, "addUser");
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public void sendMessageAll(String message) {
        mediator.notify(this, message, null, "sendMessageAll");
    }

    @Override
    public void sendMessage(String message, String userTo) {
        mediator.notify(this, message, userTo, "sendMessage");
    }

    @Override
    public void receiveMassage(String message, String userFrom) {
        System.out.println("User " + userId + " receives message: " + message + " from user " + userFrom);
    }

    @Override
    public void createGroup(String groupName) {
        mediator.notify(this, groupName, null, "createGroup");
    }

    @Override
    public void addUserToGroup(String userId, String groupName) {
        mediator.notify(this, groupName, userId, "addUserToGroup");
    }

    @Override
    public void removeUserFromGroup(String userId, String groupName) {
        mediator.notify(this, groupName, userId, "removeUserFromGroup");
    }

    @Override
    public void sendMessageToGroup(String message, String groupName) {
        mediator.notify(this, message, groupName, "sendMessageToGroup");
    }
}
