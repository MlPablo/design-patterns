package task_3_2.components;

public class Engine {
    private final double power;
    private final double volume;
    private final double torque;
    private final FuelType fuelType;

    public Engine(double power, double volume, double torque, FuelType fuelType) {
        this.power = power;
        this.volume = volume;
        this.torque = torque;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", volume=" + volume +
                ", torque=" + torque +
                ", fuelType=" + fuelType +
                '}';
    }
}
