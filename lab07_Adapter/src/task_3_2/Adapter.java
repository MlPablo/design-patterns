package task_3_2;

import task_3_2.com.customs.*;
import com.vehiclecalculator.*;

public class Adapter implements Customs{

    float taxRate = 0.2f;
    float UsdToUah = 37;

    public Adapter(float taxRate, float UsdToUah) {
        this.taxRate = taxRate;
        this.UsdToUah = UsdToUah;
    }

    public Adapter() {
    }

    @Override
    public float vehiclePrice(Auto auto) {
        Vehicle vehicle;
        VehicleCalculator vehicleCalculator;

        if (auto.model.equals("truck")){
            vehicle = new Truck(auto.age, auto.mileage);
            vehicleCalculator = new TruckCalculator();
        }
        else {
            vehicle = new Car(auto.age, auto.model, auto.damaged ? 1.f : 0.f);
            vehicleCalculator = new CarCalculator();
        }

        vehicleCalculator.setVehicle(vehicle);
        String priceInUsd = vehicleCalculator.calculatePrice();

        return priceInUah(priceInUsd);
    }

    @Override
    public float tax(Auto auto) {
        return vehiclePrice(auto) * taxRate;
    }

    private float priceInUah(String priceInUsd) {
        priceInUsd = priceInUsd.replace("USD", "");
        return Float.parseFloat(priceInUsd) * UsdToUah;
    }
}
