package task_3_2.components;

public class WheelDisk implements Cloneable {
    private final double diameter;
    private final double width;
    private final MaterialType materialType;

    public WheelDisk(double diameter, double width, MaterialType materialType) {
        this.diameter = diameter;
        this.width = width;
        this.materialType = materialType;
    }

    public WheelDisk(WheelDisk other) {
        this(other.diameter, other.width, other.materialType);
    }

    @Override
    public String toString() {
        return "WheelDisk{" +
                "diameter=" + diameter +
                ", width=" + width +
                ", materialType=" + materialType +
                '}';
    }

    @Override
    public WheelDisk clone() {
        return new WheelDisk(this);
    }
}
