package task_3_2;

public class UserSize implements Size {
    private final int x;
    private final int y;

    public UserSize(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String getSize() {
        return String.format("%d x %d px", x, y);
    }
}
