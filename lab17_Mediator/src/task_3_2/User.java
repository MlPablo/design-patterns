package task_3_2;

public interface User {
    void sendMessageAll(String message);
    void sendMessage(String message, String userTo);
    void receiveMassage(String message, String userFrom);
    String getUserId();
    void createGroup(String groupName);
    void addUserToGroup(String userId, String groupName);
    void removeUserFromGroup(String userId, String groupName);
    void sendMessageToGroup(String message, String groupName);
}
