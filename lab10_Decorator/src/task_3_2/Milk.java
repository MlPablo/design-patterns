package task_3_2;

public class Milk extends BaseDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return wrapper.description() + ", Milk";
    }

    @Override
    public float cost() {
        return wrapper.cost() + 0.2f;
    }
}
