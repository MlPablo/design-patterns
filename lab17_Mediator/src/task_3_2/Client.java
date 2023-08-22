package task_3_2;

public class Client {

    public static void main(String[] args) {

        Mediator mediator = new ChatMediator();

        ConcreteUser user1 = new ConcreteUser("User1", mediator);
        ConcreteUser user2 = new ConcreteUser("User2", mediator);
        ConcreteUser user3 = new ConcreteUser("User3", mediator);
        ConcreteUser user4 = new ConcreteUser("User4", mediator);
        ConcreteUser user5 = new ConcreteUser("User5", mediator);
        ConcreteUser user6 = new ConcreteUser("User6", mediator);

        user1.sendMessageAll("Hello, world!");

        user2.sendMessage("Hello!", "User1");

        user3.createGroup("Group1");
        user3.addUserToGroup("User4", "Group1");
        user3.addUserToGroup("User5", "Group1");
        user3.addUserToGroup("User6", "Group1");

        user4.sendMessageToGroup("Hello, group1!", "Group1");

        user5.createGroup("Group2");
        user5.addUserToGroup("User1", "Group2");
        user5.addUserToGroup("User6", "Group2");

        user4.sendMessageToGroup("Hello, group2!", "Group2");

        user5.removeUserFromGroup("User6", "Group1");
        user5.removeUserFromGroup("User6", "Group2");
    }

}
