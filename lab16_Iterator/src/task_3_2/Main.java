package task_3_2;

public class Main {

  public static void main(String[] args) {

    ShopItem pens = new ShopItem("pen", 175);
    ShopItem pencils = new ShopItem("pencil", 0);
    ShopItem paper = new ShopItem("paper", 500);

    Shop shop = new Shop();
    shop.putItem(pens);
    shop.putItem(pencils);
    shop.putItem(paper);

    System.out.println("Alphabetical order:");
    for (Iterator iterator = shop.iterator(); iterator.hasNext(); ) {
        System.out.println(iterator.next());
    }

    System.out.println("\nQuantity descending order:");
    for (Iterator iterator = shop.quantityDescendingIterator(); iterator.hasNext(); ) {
        System.out.println(iterator.next());
    }
  }
}
