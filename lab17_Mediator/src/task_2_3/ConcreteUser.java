package task_2_3;

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
}
