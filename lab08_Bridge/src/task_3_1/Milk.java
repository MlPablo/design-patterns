package task_3_1;

public class Milk implements BeverageAdditive {
    private final int milkVolume;

    public Milk(int milkVolume) {
        this.milkVolume = milkVolume;
    }

    @Override
    public int cost() {
        return (int) (milkVolume / 20.0);
    }

    @Override
    public String getAdditive() {
        return "milk";
    }

    @Override
    public int getVolume() {
        return milkVolume;
    }
}
