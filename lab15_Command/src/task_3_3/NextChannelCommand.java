package task_3_3;

public class NextChannelCommand implements Command {
    private final Device device;

    public NextChannelCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.nextChanel();
    }
}
