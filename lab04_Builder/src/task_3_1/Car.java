package task_3_1;

import task_3_1.components.*;

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
}
