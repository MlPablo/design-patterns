package task_3_1;

public interface Mediator {
    void notify(Event event, int planeId);
}

enum Event {
    TAKE_OFF,
    LAND
}