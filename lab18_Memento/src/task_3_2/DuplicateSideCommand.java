package task_3_2;

public class DuplicateSideCommand implements Command {
    private final Triangle triangle;
    private final Caretaker caretaker;
    private final String side;

    public DuplicateSideCommand(Triangle triangle, Caretaker caretaker, String side) {
        this.triangle = triangle;
        this.caretaker = caretaker;
        this.side = side;
    }

    public void execute() {
        caretaker.saveMemento(triangle.save());
        switch (side) {
            case "a" -> triangle.duplicateA();
            case "b" -> triangle.duplicateB();
            case "c" -> triangle.duplicateC();
        }
    }
}
