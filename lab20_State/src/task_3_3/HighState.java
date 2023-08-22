package task_3_3;

public class HighState extends State {
    public HighState(Fan context) {
        super(context);
    }

    @Override
    public void turnUp() {}

    @Override
    public void turnDown() {
        context.setState(new MediumState(context));
        System.out.println("Fan is medium now");
    }
}
