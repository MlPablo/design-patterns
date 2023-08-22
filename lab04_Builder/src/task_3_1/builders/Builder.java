package task_3_1.builders;

import task_3_1.Car;
import task_3_1.components.*;

public interface Builder {
    Builder setBodyType(BodyType bodyType);
    Builder setTransmission(Transmission transmission);
    Builder setWheelDisk(WheelDisk wheelDisk);
    Builder setRubber(Rubber rubber);
    Builder setEngine(Engine engine);
    Builder setColor(String color);
    Car build();
}
