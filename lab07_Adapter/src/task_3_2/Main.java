package task_3_2;

import com.vehiclecalculator.CarCalculator;
import com.vehiclecalculator.Vehicle;
import com.vehiclecalculator.VehicleCalculator;
import task_7_3_2.com.customs.Auto;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(5, "Audi", 0.2f, 100_000);
        VehicleCalculator calculator = new CarCalculator();
        calculator.setVehicle(vehicle);
        System.out.println(calculator.calculatePrice());

        Adapter adapter = new Adapter();
        Auto auto = new Auto(5, "Audi", true, 100_000);
        System.out.println("Price in UAH: " + adapter.vehiclePrice(auto));
        System.out.println("Tax in UAH: " + adapter.tax(auto));
        System.out.println("Total price in UAH: " + (adapter.vehiclePrice(auto) + adapter.tax(auto)));
    }
}
