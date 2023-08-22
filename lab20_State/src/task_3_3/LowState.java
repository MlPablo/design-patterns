package task_3_3;

public class LowState extends State {
    public LowState(Fan context) {
        super(context);
    }

    @Override
    public void turnUp() {
        context.setState(new MediumState(context));
        System.out.println("Fan is medium now");
    }

    @Override
    public void turnDown() {}
}
