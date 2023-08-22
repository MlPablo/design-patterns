package task_3_2;

public class Shortcut {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}
