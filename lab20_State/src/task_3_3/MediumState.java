package task_3_3;

public class MediumState extends State {
    public MediumState(Fan context) {
        super(context);
    }

    @Override
    public void turnUp() {
        context.setState(new HighState(context));
        System.out.println("Fan is high now");
    }

    @Override
    public void turnDown() {
        context.setState(new LowState(context));
        System.out.println("Fan is low now");
    }
}
