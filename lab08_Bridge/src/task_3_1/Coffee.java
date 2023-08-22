package task_3_1;

public class Coffee extends Beverage {
    final private boolean extra_coffee;

    public Coffee(int sugar, BeverageAdditive additive, BeverageType type, boolean extra_coffee) {
        super(sugar, additive, type);
        this.extra_coffee = extra_coffee;
    }

    public Coffee(int sugar, BeverageAdditive additive, BeverageType type) {
        this(sugar, additive, type, false);
    }

    @Override
    public void drink() {
        String str = "Drink " + (extra_coffee ? "black " : "") + "coffee ";
        if (!additive.getAdditive().equals("hot water")) {
            str += "with " + additive.getAdditive() + " ";
        }
        System.out.println(str + type.getType() + "!");
    }

    @Override
    public void prepare() {
        System.out.println("Put some coffee...");
        if (extra_coffee) System.out.println("Put extra coffee...");
        System.out.println("Put some " + additive.getAdditive() + " : " + additive.getVolume() + " ml...");
        if (sugar > 0) System.out.printf("Put some sugar: %s pieces ...%n", sugar);
    }

    @Override
    public int cost() {
        return 10 + additive.cost();
    }
}
