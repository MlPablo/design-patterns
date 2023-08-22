package task_3_1;

import java.util.Map;

public class AdminAuthHandler extends AuthHandler {
    @Override
    public void handleRequest(Account account, Map<String, String> userCredentials, Map<String, String> adminCredentials) {
        if (account.getAccessType() == Account.AccessType.Administrator) {
            String passwordFromAdminsStorage = adminCredentials.get(account.getLogin());
            if (account.getPassword().equals(passwordFromAdminsStorage) && account.getPassword().length() >= 8) {
                System.out.println("Administrator access provided: " + account.getLogin());
            } else {
                System.out.println("Access denied: " + account.getLogin());
            }
        } else if (nextHandler != null) {
            nextHandler.handleRequest(account, userCredentials, adminCredentials);
        }
    }
}
