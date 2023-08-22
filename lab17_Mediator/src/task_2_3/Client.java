package task_2_3;

public class Client {

    public static void main(String[] args) {

        Mediator mediator = new ChatMediator();

        ConcreteUser user1 = new ConcreteUser("User1", mediator);
        ConcreteUser user2 = new ConcreteUser("User2", mediator);
        ConcreteUser user3 = new ConcreteUser("User3", mediator);
        ConcreteUser user4 = new ConcreteUser("User4", mediator);

        user1.sendMessageAll("Hello, world!");

        user2.sendMessage("Hello!", "User1");

    }

}
