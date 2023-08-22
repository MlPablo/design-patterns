package task_3_2;

public class ImageButton extends Button {

    public ImageButton(Size size) {
        super(size);
    }

    @Override
    public void draw() {
        System.out.println("Setting size to " + size.getSize() + "...");
        System.out.println("Drawing an image button.\n");
    }
}
