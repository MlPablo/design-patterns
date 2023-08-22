package task_3_1;

public class Chocolate extends Beverage {
    public Chocolate(int sugar, BeverageAdditive additive, BeverageType type) {
        super(sugar, additive, type);
    }

    @Override
    public void drink() {
        String str = "Drink chocolate beverage ";
        if (!additive.getAdditive().equals("hot water")) {
            str += "with " + additive.getAdditive() + " ";
        }
        System.out.println(str + type.getType() + "!");
    }

    @Override
    public void prepare() {
        System.out.println("Put some cacao...");
        System.out.println("Put some " + additive.getAdditive() + " : " + additive.getVolume() + " ml...");
        if (sugar > 0) System.out.printf("Put some sugar: %s pieces ...%n", sugar);
    }

    @Override
    public int cost() {
        return 15 + additive.cost();
    }
}
