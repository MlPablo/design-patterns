package task_3_1;

public class Water implements BeverageAdditive {
    private final int waterVolume;

    public Water(int waterVolume) {
        this.waterVolume = waterVolume;
    }

    @Override
    public int cost() {
        return 0;
    }

    @Override
    public String getAdditive() {
        return "hot water";
    }

    @Override
    public int getVolume() {
        return waterVolume;
    }
}
