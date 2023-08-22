package task_3_1;

public abstract class Beverage {

    protected final int sugar;
    protected final BeverageAdditive additive;
    protected final BeverageType type;

    public Beverage(int sugar, BeverageAdditive additive, BeverageType type) {
        this.sugar = sugar;
        this.additive = additive;
        this.type = type;
    }

    public abstract void prepare();
    public abstract  void drink();
    public abstract int cost();
}
