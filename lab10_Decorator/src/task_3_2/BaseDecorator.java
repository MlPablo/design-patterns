package task_3_2;

abstract public class BaseDecorator extends Beverage {

    final protected Beverage wrapper;

    public BaseDecorator(Beverage beverage) {
        this.wrapper = beverage;
    }
}
