package task_2_3;

public interface User {
    void sendMessageAll(String message);
    void sendMessage(String message, String userTo);
    void receiveMassage(String message, String userFrom);
    String getUserId();
}
