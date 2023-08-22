package task_3_2.components;

public class Transmission implements Cloneable {
    private final int numberOfGears;
    private final TransmissionType transmissionType;

    public Transmission(int numberOfGears, TransmissionType transmissionType) {
        this.numberOfGears = numberOfGears;
        this.transmissionType = transmissionType;
    }

    public Transmission(Transmission other) {
        this(other.numberOfGears, other.transmissionType);
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "numberOfGears=" + numberOfGears +
                ", transmissionType=" + transmissionType +
                '}';
    }

    @Override
    public Transmission clone() {
        return new Transmission(this);
    }
}
