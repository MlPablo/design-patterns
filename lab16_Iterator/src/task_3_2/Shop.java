package task_3_2;

import java.util.HashMap;

public class Shop implements IterableCollection {

    private final HashMap<String, ShopItem> items = new HashMap<>();

    void putItem(ShopItem item){
        items.put(item.getName(), item);
    }

    @Override
    public Iterator iterator() {
        return new AlphabeticalOrderIterator(items.values());
    }

    public Iterator quantityDescendingIterator() {
        return new QuantityDescendingOrderIterator(items.values());
    }
}
