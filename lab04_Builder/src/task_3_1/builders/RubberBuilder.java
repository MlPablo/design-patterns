package task_3_1.builders;

import task_3_1.components.Rubber;
import task_3_1.components.RubberType;

public class RubberBuilder {
    private RubberType rubberType;
    private double hardness;
    private double elasticity;

    public RubberBuilder setRubberType(RubberType rubberType) {
        this.rubberType = rubberType;
        return this;
    }

    public RubberBuilder setHardness(double hardness) {
        this.hardness = hardness;
        return this;
    }

    public RubberBuilder setElasticity(double elasticity) {
        this.elasticity = elasticity;
        return this;
    }

    public Rubber build() {
        return new Rubber(rubberType, hardness, elasticity);
    }
}
