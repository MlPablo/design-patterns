package task_3_2;

import task_3_2.builders.Builder;
import task_3_2.builders.CarBuilderDetailed;
import task_3_2.components.*;

public class Client {

    public static void main(String[] args) {
        Builder builder = new CarBuilderDetailed();
        Director director = new Director(builder);

        Car car = director.buildSedan("red");
        System.out.println(car);

        Car car2 = car.clone();

        System.out.println(car2);
        // check this classes different
        System.out.println(car == car2);
    }
}
