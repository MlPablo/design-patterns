package task_3_1;

public class TriangleMementoV2 implements Memento {
    private final TriangleV3 triangle;
    private final float a;
    private final float b;
    private final float c;

    public TriangleMementoV2(TriangleV3 triangle, float a, float b, float c) {
        this.triangle = triangle;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void restore() {
        triangle.setA(a);
        triangle.setB(b);
        triangle.setC(c);
    }
}
