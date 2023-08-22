package task_3_2.components;

public enum TransmissionType {
    MANUAL, AUTOMATIC;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
