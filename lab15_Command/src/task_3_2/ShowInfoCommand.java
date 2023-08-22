package task_3_2;

public class ShowInfoCommand implements Command {
    private final Document document;

    public ShowInfoCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.showInfo();
    }
}
