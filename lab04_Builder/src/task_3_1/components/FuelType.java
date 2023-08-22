package task_3_1.components;

public enum FuelType {
    PETROL, DIESEL, ELECTRIC;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
