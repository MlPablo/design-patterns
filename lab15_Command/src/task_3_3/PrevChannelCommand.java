package task_3_3;

public class PrevChannelCommand implements Command {
    private final Device device;

    public PrevChannelCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.prevChanel();
    }
}
