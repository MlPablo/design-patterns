package task_3_1;

public class PlayingState extends State {
    public PlayingState(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
    }

    @Override
    public void play() { }

    @Override
    public void pause() {
        context.setState(new PausedState(context));
        context.setIcon("play button");
        System.out.println("Video paused, icon set to " + context.getIcon());
    }
}
