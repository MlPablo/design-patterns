package task_3_1;

import task_3_1.builders.CarBuilder;
import task_3_1.builders.CarBuilderDetailed;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new CarBuilderDetailed());

        Car car = director.buildSedan("red");
        System.out.println(car);

        Car car2 = director.buildPickUp("blue");
        System.out.println(car2);

        Car car3 = director.buildSedan("green");
        director.setBuilder(new CarBuilder());
        Car car4 = director.buildSedan("green");
        System.out.println(car4);
    }
}
