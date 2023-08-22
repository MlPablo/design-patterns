package task_3_2;

import java.util.*;

public class QuantityDescendingOrderIterator implements Iterator {

    private final List<ShopItem> items;
    private int position = 0;

    public QuantityDescendingOrderIterator(Collection<ShopItem> items) {
        this.items = new ArrayList<>(items);
        this.items.sort(Comparator.comparing(ShopItem::getQuantity).reversed());
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
