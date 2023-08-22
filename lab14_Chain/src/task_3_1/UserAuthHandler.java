package task_3_1;

import java.util.Map;

public class UserAuthHandler extends AuthHandler {
    @Override
    public void handleRequest(Account account, Map<String, String> userCredentials, Map<String, String> adminCredentials) {
        if (account.getAccessType() == Account.AccessType.User) {
            String passwordFromUserStorage = userCredentials.get(account.getLogin());
            if (account.getPassword().equals(passwordFromUserStorage)) {
                System.out.println("User access provided: " + account.getLogin());
            } else {
                System.out.println("Access denied: " + account.getLogin());
            }
        } else if (nextHandler != null) {
            nextHandler.handleRequest(account, userCredentials, adminCredentials);
        }
    }
}
