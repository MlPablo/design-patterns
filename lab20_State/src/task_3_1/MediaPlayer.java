package task_3_1;

public class MediaPlayer {

    private State state = new PausedState(this);
    private String icon = "play button";

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void play() {
        state.play();
    }

    public void pause() {
        state.pause();
    }
}
