package task_3_2;

import java.util.Comparator;
import java.util.Stack;

public class Caretaker{
    private final Stack<Memento> mementos = new Stack<>();
    private final Triangle triangle;

    public Caretaker(Triangle triangle) {
        this.triangle = triangle;
    }

    public void saveMemento(Memento memento) {
        mementos.push(memento);
    }

    public void restoreMemento() {
        if (mementos.isEmpty()) {
            return;
        }

        final Memento memento = mementos.pop();
        memento.restore();
    }

    public Memento getMinAreaMemento() {
        return mementos.stream().min(Comparator.comparing(memento -> {
            memento.restore();
            return triangle.square();
        })).orElse(null);
    }
}
