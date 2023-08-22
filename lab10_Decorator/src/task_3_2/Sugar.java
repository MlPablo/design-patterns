package task_3_2;

public class Sugar extends BaseDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return wrapper.description() + ", Sugar";
    }

    @Override
    public float cost() {
        return wrapper.cost() + 0.1f;
    }
}
