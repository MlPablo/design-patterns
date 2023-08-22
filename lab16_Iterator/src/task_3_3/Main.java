package task_3_3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        final Box root = new Box(-999);

        for (int j = 0; j < 10; j++) {
            final Box box = new Box(j);
            root.add(box);
            for (int i = 0; i < 10; i++) {

                String name = String.format("Item_%s", j * 10 + i);
                int value = random.nextInt(1000);
                final Item item = new Item(name, value);
                box.add(item);
            }
        }

        root.execute();

        Iterator depthIterator = new DepthIterator(root);
        Iterator breadthIterator = new BreadthIterator(root);

        Item cheapestItem = null;
        Item mostExpensiveItem = null;

        System.out.println("\nDepth iterator:");

        while (depthIterator.hasNext()) {
            Component component = depthIterator.next();
            if (component instanceof Item item) {
                if (cheapestItem == null || item.getValue() < cheapestItem.getValue()) {
                    cheapestItem = item;
                }
                if (mostExpensiveItem == null || item.getValue() > mostExpensiveItem.getValue()) {
                    mostExpensiveItem = item;
                }
            }
        }

        System.out.println("Cheapest item: " + cheapestItem);
        System.out.println("Most expensive item: " + mostExpensiveItem);

        cheapestItem = null;
        mostExpensiveItem = null;

        System.out.println("\nBreadth iterator:");

        while (breadthIterator.hasNext()) {
            Component component = breadthIterator.next();
            if (component instanceof Item item) {
                if (cheapestItem == null || item.getValue() < cheapestItem.getValue()) {
                    cheapestItem = item;
                }
                if (mostExpensiveItem == null || item.getValue() > mostExpensiveItem.getValue()) {
                    mostExpensiveItem = item;
                }
            }
        }

        System.out.println("Cheapest item: " + cheapestItem);
        System.out.println("Most expensive item: " + mostExpensiveItem);
    }
}
