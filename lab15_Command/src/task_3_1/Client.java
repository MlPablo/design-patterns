package task_3_1;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp hallLamp = new Lamp("Hall");
        Lamp bedroomLamp = new Lamp("Bedroom");
        Lamp bathroomLamp = new Lamp("Bathroom");

        Command kitchenLampCommand = new LightCommand(kitchenLamp);
        Command hallLampCommand = new LightCommand(hallLamp);
        Command bedroomLampCommand = new LightCommand(bedroomLamp);
        Command bathroomLampCommand = new LightCommand(bathroomLamp);

        List<Command> commands = Arrays.asList(kitchenLampCommand, hallLampCommand, bedroomLampCommand, bathroomLampCommand);
        Command universalCommand = new UniversalCommand(commands);

        Controller controllerKitchenLamp = new Controller();
        Controller controllerHallLamp = new Controller();
        Controller controllerBedroomLamp = new Controller();
        Controller controllerBathroomLamp = new Controller();
        Controller controllerUniversal = new Controller();

        controllerKitchenLamp.setCommand(kitchenLampCommand);
        controllerHallLamp.setCommand(hallLampCommand);
        controllerBedroomLamp.setCommand(bedroomLampCommand);
        controllerBathroomLamp.setCommand(bathroomLampCommand);
        controllerUniversal.setCommand(universalCommand);

        // Simulation
        controllerKitchenLamp.on();
        controllerHallLamp.on();
        controllerBedroomLamp.on();

        controllerKitchenLamp.off();
        controllerHallLamp.off();
        controllerBedroomLamp.off();

        controllerBedroomLamp.on();
        controllerBathroomLamp.on();

        controllerUniversal.off();

    }
}
