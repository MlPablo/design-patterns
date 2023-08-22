package task_3_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class AlphabeticalOrderIterator implements Iterator {
    private final List<ShopItem> items;
    private int position = 0;

    public AlphabeticalOrderIterator(Collection<ShopItem> items) {
        this.items = new ArrayList<>(items);
        this.items.sort(Comparator.comparing(ShopItem::getName, String.CASE_INSENSITIVE_ORDER));
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public ShopItem next() {
        if (hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}
