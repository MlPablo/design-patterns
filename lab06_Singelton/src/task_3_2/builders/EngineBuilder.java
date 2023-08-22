package task_3_2.builders;

import task_3_2.components.*;

public class EngineBuilder {
    private double power;
    private double volume;
    private double torque;
    private FuelType fuelType;

    public EngineBuilder setPower(double power) {
        this.power = power;
        return this;
    }

    public EngineBuilder setVolume(double volume) {
        this.volume = volume;
        return this;
    }

    public EngineBuilder setTorque(double torque) {
        this.torque = torque;
        return this;
    }

    public EngineBuilder setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public Engine build() {
        return new Engine(power, volume, torque, fuelType);
    }
}
