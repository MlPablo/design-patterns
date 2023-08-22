package task_3_2;

public class TriangleController {
    private final Triangle triangle;
    private final Caretaker caretaker;

    public TriangleController(Triangle triangle, Caretaker caretaker) {
        this.triangle = triangle;
        this.caretaker = caretaker;
    }

    private Command setA;
    private Command setB;
    private Command setC;
    private Command halfA;
    private Command halfB;
    private Command halfC;
    private Command duplicateA;
    private Command duplicateB;
    private Command duplicateC;

    public void lazyCommandInit(){
        setA = new SetSideCommand(triangle, caretaker, "a");
        setB = new SetSideCommand(triangle, caretaker, "b");
        setC = new SetSideCommand(triangle, caretaker, "c");
        halfA = new HalfSideCommand(triangle, caretaker, "a");
        halfB = new HalfSideCommand(triangle, caretaker, "b");
        halfC = new HalfSideCommand(triangle, caretaker, "c");
        duplicateA = new DuplicateSideCommand(triangle, caretaker, "a");
        duplicateB = new DuplicateSideCommand(triangle, caretaker, "b");
        duplicateC = new DuplicateSideCommand(triangle, caretaker, "c");
    }

    public void setA(float value) {
        ((SetSideCommand) setA).setValue(value);
        setA.execute();
    }

    public void setB(float value) {
        ((SetSideCommand) setB).setValue(value);
        setB.execute();
    }

    public void setC(float value) {
        ((SetSideCommand) setC).setValue(value);
        setC.execute();
    }

    public void halfA() {
        halfA.execute();
    }

    public void halfB() {
        halfB.execute();
    }

    public void halfC() {
        halfC.execute();
    }

    public void duplicateA() {
        duplicateA.execute();
    }

    public void duplicateB() {
        duplicateB.execute();
    }

    public void duplicateC() {
        duplicateC.execute();
    }
}
