package task_3_2;

public class MenuItem {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void select() {
        command.execute();
    }
}
