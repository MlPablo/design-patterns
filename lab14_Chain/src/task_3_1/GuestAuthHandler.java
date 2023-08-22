package task_3_1;

import java.util.Map;

public class GuestAuthHandler extends AuthHandler {
    @Override
    public void handleRequest(Account account, Map<String, String> userCredentials, Map<String, String> adminCredentials) {
        if (account.getAccessType() == Account.AccessType.Guest) {
            System.out.println("Guest access provided!");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(account, userCredentials, adminCredentials);
        }
    }
}
