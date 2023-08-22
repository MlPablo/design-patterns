package task_3_1;

public class PausedState extends State {
    public PausedState(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
    }

    @Override
    public void play() {
        context.setState(new PlayingState(context));
        context.setIcon("pause button");
        System.out.println("Video playing, icon set to " + context.getIcon());
    }

    @Override
    public void pause() { }
}
