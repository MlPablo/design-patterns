package task_3_1.components;

public class Transmission {
    private final int numberOfGears;
    private final TransmissionType transmissionType;

    public Transmission(int numberOfGears, TransmissionType transmissionType) {
        this.numberOfGears = numberOfGears;
        this.transmissionType = transmissionType;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "numberOfGears=" + numberOfGears +
                ", transmissionType=" + transmissionType +
                '}';
    }
}
