package task_3_2;

public class TextEditor {

    private Document document;

    final private Button saveButton;
    final private Button printButton;

    final private MenuItem saveMenuItem;
    final private MenuItem printMenuItem;
    final private MenuItem showInfoMenuItem;

    final private Shortcut saveShortcut;
    final private Shortcut printShortcut;

    public TextEditor() {
        saveButton = new Button();
        printButton = new Button();

        saveMenuItem = new MenuItem();
        printMenuItem = new MenuItem();
        showInfoMenuItem = new MenuItem();

        saveShortcut = new Shortcut();
        printShortcut = new Shortcut();
    }

    public void newDocument(String name) {
        document = new Document(name);

        Command saveCommand = new SaveCommand(document);
        Command printCommand = new PrintCommand(document);
        Command showInfoCommand = new ShowInfoCommand(document);

        saveButton.setCommand(saveCommand);
        printButton.setCommand(printCommand);

        saveMenuItem.setCommand(saveCommand);
        printMenuItem.setCommand(printCommand);
        showInfoMenuItem.setCommand(showInfoCommand);

        saveShortcut.setCommand(saveCommand);
        printShortcut.setCommand(printCommand);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickPrintButton() {
        printButton.click();
    }

    public void selectSaveMenuItem() {
        saveMenuItem.select();
    }

    public void selectPrintMenuItem() {
        printMenuItem.select();
    }

    public void selectShowInfoMenuItem() {
        showInfoMenuItem.select();
    }

    public void pressSaveShortcut() {
        saveShortcut.press();
    }

    public void pressPrintShortcut() {
        printShortcut.press();
    }
}
