package task_3_3;

import java.util.List;

public class UniversalOffCommand implements Command {
    private final List<Device> devices;

    public UniversalOffCommand(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        devices.forEach(Device::off);
    }
}
