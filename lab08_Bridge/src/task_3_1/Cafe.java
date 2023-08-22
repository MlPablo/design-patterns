package task_3_1;

public class Cafe {

    public static void main(String[] args) {
        Chocolate blackChocolate = new Chocolate(3, new Water(200), new RestaurantBeverage());
        Coffee blackCoffee = new Coffee(3, new Water(200), new RestaurantBeverage(), true);
        Tee blackTee = new Tee(0, new Water(300), new RestaurantBeverage());

        beverageInfo(blackChocolate);
        beverageInfo(blackCoffee);
        beverageInfo(blackTee);

        Chocolate milkChocolate = new Chocolate(3, new Milk(200), new TakeawayBeverage());
        Coffee coffeeWithMilk = new Coffee(3, new Milk(200), new TakeawayBeverage());
        Tee teeWithMilk = new Tee(2, new Milk(300), new TakeawayBeverage());

        beverageInfo(milkChocolate);
        beverageInfo(coffeeWithMilk);
        beverageInfo(teeWithMilk);
    }

    private static void beverageInfo(Beverage beverage) {

        System.out.println("=========================");

        beverage.prepare();
        System.out.printf("Cost of beverage: %s grn\n",  beverage.cost());
        beverage.drink();
    }

}
