package task_3_1;

public class Tee extends Beverage {
    public Tee(int sugar, BeverageAdditive additive, BeverageType type) {
        super(sugar, additive, type);
    }

    @Override
    public void drink() {
        String str = "Drink ";
        if (!additive.getAdditive().equals("hot water")) {
            str += "tee with " + additive.getAdditive() + " ";
        }
        else {
            str += "black tee ";
        }
        System.out.println(str + type.getType() + "!");
    }

    @Override
    public void prepare() {
        System.out.println("Put some tee...");
        System.out.println("Put some " + additive.getAdditive() + " : " + additive.getVolume() + " ml...");
        if (sugar > 0) System.out.printf("Put some sugar: %s pieces ...%n", sugar);
    }

    @Override
    public int cost() {
        return 7 + additive.cost();
    }
}
