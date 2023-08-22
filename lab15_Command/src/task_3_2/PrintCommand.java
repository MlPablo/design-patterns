package task_3_2;

public class PrintCommand implements Command {
    private final Document document;

    public PrintCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.print();
    }
}
