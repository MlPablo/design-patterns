package task_3_2;

public abstract class State {
    protected final MediaPlayer context;

    public State(MediaPlayer mediaPlayer) {
        this.context = mediaPlayer;
    }

    abstract void play();
    abstract void pause();
    abstract void next();
    abstract void prev();
    abstract void stop();
}
