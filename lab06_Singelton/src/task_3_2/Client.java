package task_3_2;


import task_3_2.builders.CarBuilder;
import task_3_2.builders.CarBuilderDetailed;

public class Client {
    public static void main(String[] args) {
        Director director = Director.getInstance();
        director.setBuilder(new CarBuilderDetailed());

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
