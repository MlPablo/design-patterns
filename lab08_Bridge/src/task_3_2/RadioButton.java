package task_3_2;

public class RadioButton extends Button {

    public RadioButton(Size size) {
        super(size);
    }

    @Override
    public void draw() {
        System.out.println("Setting size to " + size.getSize() + "...");
        System.out.println("Drawing a radio button.\n");
    }

}
