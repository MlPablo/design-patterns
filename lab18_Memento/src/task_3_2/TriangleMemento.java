package task_3_2;

public class TriangleMemento implements Memento {
    private final Triangle triangle;
    private final float a;
    private final float b;
    private final float c;

    public TriangleMemento(Triangle triangle, float a, float b, float c) {
        this.triangle = triangle;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void restore() {
        triangle.restore(a, b, c);
    }
}
