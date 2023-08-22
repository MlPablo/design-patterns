package task_3_2.components;

public class Rubber {
    private final RubberType rubberType;
    private final double hardness;
    private final double elasticity;

    public Rubber(RubberType rubberType, double hardness, double elasticity) {
        this.rubberType = rubberType;
        this.hardness = hardness;
        this.elasticity = elasticity;
    }

    @Override
    public String toString() {
        return "Rubber{" +
                "rubberType=" + rubberType +
                ", hardness=" + hardness +
                ", elasticity=" + elasticity +
                '}';
    }
}
