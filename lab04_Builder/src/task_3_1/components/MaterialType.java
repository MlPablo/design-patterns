package task_3_1.components;

public enum MaterialType {
    ALUMINIUM, STEEL, CARBON;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
