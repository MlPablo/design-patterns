package task_3_1.components;

public enum TransmissionType {
    MANUAL, AUTOMATIC;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
