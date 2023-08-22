package task_3_1.builders;

import task_3_1.components.Transmission;
import task_3_1.components.TransmissionType;

public class TransmissionBuilder {
    private int numberOfGears;
    private TransmissionType transmissionType;

    public TransmissionBuilder setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
        return this;
    }

    public TransmissionBuilder setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
        return this;
    }

    public Transmission build() {
        return new Transmission(numberOfGears, transmissionType);
    }
}
