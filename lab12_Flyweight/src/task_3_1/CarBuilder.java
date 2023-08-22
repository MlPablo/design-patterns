package task_2_2;

public class CarBuilder {

    private final EngineFlyweightFactory engineFlyweightFactory = new EngineFlyweightFactory();
    private final WheelFlyweightFactory wheelFlyweightFactory = new WheelFlyweightFactory();

    public CarBuilder setType(Car.Type type) {
        this.type = type;
        return this;
    }

    public CarBuilder setCarColor(Car.CarColor carColor) {
        this.carColor = carColor;
        return this;
    }

    public CarBuilder setEngine(int power, Engine.Fuel fuel) {
        this.engine = engineFlyweightFactory.getEngine(power, fuel);
        return this;
    }

    public CarBuilder setWheel(int diameter) {
        this.wheel = wheelFlyweightFactory.getWheel(diameter);
        return this;
    }

    private Car.Type type;
    private Car.CarColor carColor;
    private Engine engine;
    private Wheel wheel;

    public CarBuilder reset() {
        type = Car.Type.Sedan;
        carColor = Car.CarColor.White;
        engine = engineFlyweightFactory.getEngine(105, Engine.Fuel.Petrol);
        wheel = wheelFlyweightFactory.getWheel(17);
        return this;
    }

    public CarBuilder() {
        reset();
    }

    public Car build() {

        if (type == null || carColor == null || engine == null || wheel == null) {
            throw new IllegalArgumentException();
        }

        return new Car(type, carColor, engine, wheel);
    }

}
