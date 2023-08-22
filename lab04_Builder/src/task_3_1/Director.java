package task_3_1;

import task_3_1.builders.*;
import task_3_1.components.*;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Car buildSedan(String color) {
        if (builder instanceof CarBuilderDetailed)
            System.out.println("Sedan is building...");
        Car car = builder
                .setBodyType(BodyType.SEDAN)
                .setTransmission(new TransmissionBuilder()
                        .setNumberOfGears(6)
                        .setTransmissionType(TransmissionType.MANUAL)
                        .build()
                ).setEngine(new EngineBuilder()
                        .setFuelType(FuelType.DIESEL)
                        .setPower(150)
                        .setTorque(300)
                        .setVolume(2.0)
                        .build()
                ).setWheelDisk(new WheelDiskBuilder()
                        .setDiameter(16)
                        .setMaterialType(MaterialType.ALUMINIUM)
                        .setWidth(6)
                        .build()
                ).setRubber(new RubberBuilder()
                        .setRubberType(RubberType.SILICONE)
                        .setElasticity(0.5)
                        .setHardness(50)
                        .build()
                ).setColor(color)
                .build();
        if (builder instanceof CarBuilderDetailed)
            System.out.println("Sedan is built!");
        return car;
    }

    public Car buildPickUp(String color){
        if (builder instanceof CarBuilderDetailed)
            System.out.println("Pickup is building...");
        Car car = builder
                .setBodyType(BodyType.PICKUP)
                .setTransmission(new TransmissionBuilder()
                        .setNumberOfGears(6)
                        .setTransmissionType(TransmissionType.AUTOMATIC)
                        .build()
                ).setEngine(new EngineBuilder()
                        .setFuelType(FuelType.ELECTRIC)
                        .setPower(200)
                        .setTorque(400)
                        .setVolume(3.0)
                        .build()
                ).setWheelDisk(new WheelDiskBuilder()
                        .setDiameter(18)
                        .setMaterialType(MaterialType.ALUMINIUM)
                        .setWidth(8)
                        .build()
                ).setRubber(new RubberBuilder()
                        .setRubberType(RubberType.SYNTHETIC)
                        .setElasticity(0.5)
                        .setHardness(50)
                        .build()
                ).setColor(color)
                .build();
        if (builder instanceof CarBuilderDetailed)
            System.out.println("Pickup is built!");
        return car;
    }
}
