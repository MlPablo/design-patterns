package task_14_3_3;

public abstract class OperationHandler {
    protected OperationHandler nextHandler;

    public void setSuccessor(OperationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract double handle(String operation, double a, double b);
}
