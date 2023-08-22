package task_14_3_3;

public class Client {
    public static void main(String[] args) {
        OperationHandler calculator = getChainOfHandlers();
        String[] operations = {"+", "-", "*", "/"};

        for (int i = 0; i < 20; i++){
            double a = Math.random() * 10;
            double b = Math.random() * 10;
            String operation = operations[(int) (Math.random() * 4)];

            System.out.println(a + " " + operation + " " + b + " = " + calculator.handle(operation, a, b));
        }
    }

    private static OperationHandler getChainOfHandlers() {
        OperationHandler additionHandler = new AdditionHandler();
        OperationHandler subtractionHandler = new SubtractionHandler();
        OperationHandler multiplicationHandler = new MultiplicationHandler();
        OperationHandler divisionHandler = new DivisionHandler();

        additionHandler.setSuccessor(subtractionHandler);
        subtractionHandler.setSuccessor(multiplicationHandler);
        multiplicationHandler.setSuccessor(divisionHandler);

        return additionHandler;
    }
}
