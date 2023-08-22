package task_3_1;

import java.util.List;

public class UniversalCommand implements Command {
    private final List<Command> commands;

    public UniversalCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void on() {
        for (Command command : commands) {
            command.on();
        }
    }

    @Override
    public void off() {
        for (Command command : commands) {
            command.off();
        }
    }
}
