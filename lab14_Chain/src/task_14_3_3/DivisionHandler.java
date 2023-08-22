package task_14_3_3;

public class DivisionHandler extends OperationHandler {
    @Override
    public double handle(String operation, double a, double b) {
        if (operation.equals("/")) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a / b;
        } else if (nextHandler != null) {
            return nextHandler.handle(operation, a, b);
        }
        return 0;
    }
}
