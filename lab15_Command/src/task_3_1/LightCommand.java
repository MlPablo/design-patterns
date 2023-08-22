package task_3_1;

public class LightCommand implements Command{
    private final Lamp lamp;

    public LightCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void on() {
        lamp.lightOn();
    }

    @Override
    public void off() {
        lamp.lightOff();
    }
}
