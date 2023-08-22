package task_3_2.components;

public class Rubber implements Cloneable {
    private final RubberType rubberType;
    private final double hardness;
    private final double elasticity;

    public Rubber(RubberType rubberType, double hardness, double elasticity) {
        this.rubberType = rubberType;
        this.hardness = hardness;
        this.elasticity = elasticity;
    }

    public Rubber(Rubber other) {
        this(other.rubberType, other.hardness, other.elasticity);
    }

    @Override
    public String toString() {
        return "Rubber{" +
                "rubberType=" + rubberType +
                ", hardness=" + hardness +
                ", elasticity=" + elasticity +
                '}';
    }

    @Override
    public Rubber clone() {
        return new Rubber(this);
    }
}
