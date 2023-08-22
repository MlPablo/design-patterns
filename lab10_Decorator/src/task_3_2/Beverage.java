package task_3_2;

abstract public class Beverage {

    public abstract String description();

    public abstract float cost();

    @Override
    public String toString() {
        return "Beverage: " + description() + ", $" + cost();
    }
}
