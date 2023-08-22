package task_3_2;

public class DropdownButton extends Button {

    public DropdownButton(Size size) {
        super(size);
    }

    @Override
    public void draw() {
        System.out.println("Setting size to " + size.getSize() + "...");
        System.out.println("Drawing a dropdown button.\n");
    }

}
