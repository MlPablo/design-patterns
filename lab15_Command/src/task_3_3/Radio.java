package task_3_3;

public class Radio implements Device {
    private int volume;
    private double frequency;
    private boolean isOn;

    public Radio() {
        this.isOn = false;
        this.volume = 50;
        this.frequency = 87.5;
    }

    @Override
    public void on() {
        if (isOn) {
            return;
        }
        System.out.println("Radio is on");
        isOn = true;
    }

    @Override
    public void off() {
        if (!isOn) {
            return;
        }
        System.out.println("Radio is off");
        isOn = false;
    }

    @Override
    public void volumeUp() {
        if (!isOn) {
            return;
        }
        volume++;
        System.out.println("Volume = " + volume);
    }

    @Override
    public void volumeDown() {
        if (!isOn) {
            return;
        }
        volume--;
        System.out.println("Volume = " + volume);
    }

    @Override
    public void nextChanel() {
        if (!isOn) {
            return;
        }
        frequency += 0.5;
        System.out.printf("Radio Frequency = %.1f MHz%n", frequency);
    }

    @Override
    public void prevChanel() {
        if (!isOn) {
            return;
        }
        frequency -= 0.5;
        System.out.printf("Radio Frequency = %.1f MHz%n", frequency);
    }
}
