package task_3_2.components;

public enum BodyType {
    SEDAN, HATCHBACK, COUPE, WAGON, SUV, MINIVAN, PICKUP;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
