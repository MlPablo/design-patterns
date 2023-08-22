package task_3_2;

public class SetSideCommand implements Command {
    private final Triangle triangle;
    private final Caretaker caretaker;
    private final String side;
    private float value;

    public SetSideCommand(Triangle triangle, Caretaker caretaker, String side) {
        this.triangle = triangle;
        this.caretaker = caretaker;
        this.side = side;
    }

    public void execute() {
        caretaker.saveMemento(triangle.save());
        switch (side) {
            case "a" -> triangle.setA(value);
            case "b" -> triangle.setB(value);
            case "c" -> triangle.setC(value);
        }
    }

    public void setValue(float value) {
        this.value = value;
    }
}
