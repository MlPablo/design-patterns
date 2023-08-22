package task_3_2;

public class PlayingState extends State {
    public PlayingState(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
    }

    @Override
    public void play() {}

    @Override
    public void pause() {
        context.setState(new PausedState(context));
        System.out.println("Paused track: " + context.getCurrentTrack());
    }

    @Override
    public void next() {
        context.setTrackNum(context.getCurrentTrackNum() + 1);
        System.out.println("Playing next track: " + context.getCurrentTrack());
    }

    @Override
    public void prev() {
        context.setTrackNum(context.getCurrentTrackNum() - 1);
        System.out.println("Playing previous track: " + context.getCurrentTrack());
    }

    @Override
    public void stop() {
        context.setState(new StoppedState(context));
        System.out.println("Stopped track: " + context.getCurrentTrack());
    }
}
