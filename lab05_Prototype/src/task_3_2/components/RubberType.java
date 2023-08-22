package task_3_2.components;

public enum RubberType {
    SILICONE, SYNTHETIC, NATURAL;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
