package task_3_3;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthIterator implements Iterator {
    private final Queue<Component> queue = new LinkedList<>();

    public BreadthIterator(Component root) {
        queue.add(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Component next() {
        if (hasNext()) {
            Component component = queue.poll();
            if (component instanceof Box) {
                for (Component child : ((Box) component).getChildren()) {
                    queue.offer(child);
                }
            }
            return component;
        }
        return null;
    }
}
