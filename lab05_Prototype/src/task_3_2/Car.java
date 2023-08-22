package task_3_2;

import task_3_2.components.*;

public class Car{
    private final BodyType bodyType;
    private final WheelDisk wheelDisk;
    private final Transmission transmission;
    private final Rubber rubber;
    private final Engine engine;
    private final String color;

    public Car(BodyType bodyType, WheelDisk wheelDisk, Transmission transmission, Rubber rubber, Engine engine, String color) {
        this.bodyType = bodyType;
        this.wheelDisk = wheelDisk;
        this.transmission = transmission;
        this.rubber = rubber;
        this.engine = engine;
        this.color = color;
    }

    public Car(Car other) {
        this.bodyType = other.bodyType;
        this.wheelDisk = other.wheelDisk.clone();
        this.transmission = other.transmission.clone();
        this.rubber = other.rubber.clone();
        this.engine = other.engine.clone();
        this.color = other.color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodyType=" + bodyType +
                ", wheelDisk=" + wheelDisk +
                ", transmission=" + transmission +
                ", rubber=" + rubber +
                ", engine=" + engine +
                ", color='" + color + '\'' +
                '}';
    }

    public Car clone() {
        return new Car(this);
    }
}
