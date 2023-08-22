package task_3_1.builders;

import task_3_1.components.MaterialType;
import task_3_1.components.WheelDisk;

public class WheelDiskBuilder {
    private double diameter;
    private double width;
    private MaterialType materialType;

    public WheelDiskBuilder setDiameter(double diameter) {
        this.diameter = diameter;
        return this;
    }

    public WheelDiskBuilder setWidth(double width) {
        this.width = width;
        return this;
    }

    public WheelDiskBuilder setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
        return this;
    }

    public WheelDisk build() {
        return new WheelDisk(diameter, width, materialType);
    }
}
