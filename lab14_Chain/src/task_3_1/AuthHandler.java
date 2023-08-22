package task_3_1;

import java.util.Map;

public abstract class AuthHandler {
    protected AuthHandler nextHandler;

    public void setNextHandler(AuthHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(Account account, Map<String, String> userCredentials,
                                       Map<String, String> adminCredentials);
}
