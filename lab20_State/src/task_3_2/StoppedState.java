package task_3_2;

public class StoppedState extends State {
    public StoppedState(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
    }

    @Override
    public void play() {
        context.setState(new PlayingState(context));
        System.out.println("Playing track: " + context.getCurrentTrack());
    }

    @Override
    public void pause() {}

    @Override
    public void next() {
        context.setTrackNum(context.getCurrentTrackNum() + 1);
        System.out.println("Switched to next track: " + context.getCurrentTrack());
    }

    @Override
    public void prev() {
        context.setTrackNum(context.getCurrentTrackNum() - 1);
        System.out.println("Switched to previous track: " + context.getCurrentTrack());
    }

    @Override
    public void stop() {}
}
