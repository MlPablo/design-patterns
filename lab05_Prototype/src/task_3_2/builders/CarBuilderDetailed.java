package task_3_2.builders;

import task_3_2.Car;
import task_3_2.components.*;

public class CarBuilderDetailed implements Builder{
    private BodyType bodyType;
    private WheelDisk wheelDisk;
    private Transmission transmission;
    private Rubber rubber;
    private Engine engine;
    private String color;

    @Override
    public Builder setBodyType(BodyType bodyType) {
        System.out.println("Setting body type: " + bodyType);
        this.bodyType = bodyType;
        return this;
    }

    @Override
    public Builder setTransmission(Transmission transmission) {
        System.out.println("Setting transmission: " + transmission);
        this.transmission = transmission;
        return this;
    }

    @Override
    public Builder setWheelDisk(WheelDisk wheelDisk) {
        System.out.println("Setting wheel disk: " + wheelDisk);
        this.wheelDisk = wheelDisk;
        return this;
    }

    @Override
    public Builder setRubber(Rubber rubber) {
        System.out.println("Setting rubber: " + rubber);
        this.rubber = rubber;
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        System.out.println("Setting engine: " + engine);
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setColor(String color) {
        System.out.println("Setting color: " + color);
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(bodyType, wheelDisk, transmission, rubber, engine, color);
    }
}
