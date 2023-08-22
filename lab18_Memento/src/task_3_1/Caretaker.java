package task_3_1;

import java.util.Comparator;
import java.util.Stack;

public class Caretaker<T, H> {
    private final Stack<T> mementos = new Stack<>();
    private final H triangle;

    public Caretaker(H triangle) {
        this.triangle = triangle;
    }

    public void saveMemento(T memento) {
        mementos.push(memento);
    }

    public void restoreMemento() {
        if (mementos.isEmpty()) {
            return;
        }

        final T memento = mementos.pop();
        if (memento instanceof TriangleV1.Memento memento1 && triangle instanceof TriangleV1 triangleV1) {
            triangleV1.restore(memento1);
        } else if (memento instanceof TriangleMemento triangleMemento && triangle instanceof TriangleV2 triangleV2) {
            triangleV2.restore(triangleMemento);
        } else if (memento instanceof TriangleMementoV2 triangleMementoV2) {
            triangleMementoV2.restore();
        }
    }

    public T getMaxAreaMemento() {
        return mementos.stream().max(Comparator.comparing(memento -> {
            if (memento instanceof TriangleV1.Memento memento1 && triangle instanceof TriangleV1 triangleV1) {
                triangleV1.restore(memento1);
                return triangleV1.square();
            } else if (memento instanceof TriangleMemento triangleMemento && triangle instanceof TriangleV2 triangleV2) {
                triangleV2.restore(triangleMemento);
                return triangleV2.square();
            } else if (memento instanceof TriangleMementoV2 triangleMementoV2 && triangle instanceof TriangleV3 triangleV3) {
                triangleMementoV2.restore();
                return triangleV3.square();
            }
            return 0f;
        })).orElse(null);
    }
}
