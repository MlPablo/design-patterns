package task_3_2.builders;

import task_3_2.components.*;

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
