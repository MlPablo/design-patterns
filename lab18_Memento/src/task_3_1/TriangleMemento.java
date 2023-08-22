package task_3_1;

public class TriangleMemento implements Memento {
    private final float a;
    private final float b;
    private final float c;

    public TriangleMemento(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }
}
