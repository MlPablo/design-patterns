package task_3_3;

import java.util.Arrays;
import java.util.List;

public class TVSimulator {
    public static void main(String[] args) {

        Device tv = new Television();
        Device radio = new Radio();

        Command commandOn = new OnCommand(tv);
        Command commandOff = new OffCommand(tv);
        Command commandNextChanel = new NextChannelCommand(tv);
        Command commandPrevChanel = new PrevChannelCommand(tv);
        Command commandVolumeUp = new VolumeUpCommand(tv);
        Command commandVolumeDown = new VolumeDownCommand(tv);

        RemoteController controller = new RemoteController();

        controller.setOnCommand(commandOn);
        controller.setOffCommand(commandOff);
        controller.setNextChanelCommand(commandNextChanel);
        controller.setPrevChanelCommand(commandPrevChanel);
        controller.setVolumeUpCommand(commandVolumeUp);
        controller.setVolumeDownCommand(commandVolumeDown);

        controller.deviceOn();

        for (int i = 0; i < 30; i++) {
            controller.deviceNextChanel();
        }
        controller.deviceVolumeUp();

        controller.deviceVolumeUp();
        controller.deviceVolumeUp();

        controller.devicePrevChanel();

        controller.deviceVolumeDown();

        controller.deviceOff();

        List<Device> devices = Arrays.asList(tv, radio);
        UniversalOffCommand universalOffCommand = new UniversalOffCommand(devices);

        controller.deviceOn();

        Command radioCommandOn = new OnCommand(radio);
        controller.setOnCommand(radioCommandOn);
        controller.deviceOn();

        controller.setOffCommand(universalOffCommand);
        controller.deviceOff();
    }
}
