package task_3_1;

import com.mobile.Legacy.MicroUsbCharger;

public class AdapterTypeCToMicroUsb implements MicroUsbCharger, aAdapterTypeCToMicroUsb {

    public AdapterTypeCToMicroUsb(TypeCCharger typeCCharger) {
        this.typeCCharger = typeCCharger;
    }

    final TypeCCharger typeCCharger;

    @Override
    public float getOutputVoltage() {
        return 5.f;
    }

    @Override
    public float getOutputAmperage() {
        return typeCCharger.getOutputPower() / getOutputVoltage();
    }
}
