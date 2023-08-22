package task_3_2;

public class PausedState extends State {
    public PausedState(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
    }

    @Override
    public void play() {
        context.setState(new PlayingState(context));
        System.out.println("Resumed track: " + context.getCurrentTrack());
    }

    @Override
    public void pause() {}

    @Override
    public void next() {
        context.setTrackNum(context.getCurrentTrackNum() + 1);
        System.out.println("Playing next track: " + context.getCurrentTrack());
        context.setState(new PlayingState(context));
    }

    @Override
    public void prev() {
        context.setTrackNum(context.getCurrentTrackNum() - 1);
        System.out.println("Playing previous track: " + context.getCurrentTrack());
        context.setState(new PlayingState(context));
    }

    @Override
    public void stop() {
        context.setState(new StoppedState(context));
        System.out.println("Stopped track: " + context.getCurrentTrack());
    }
}
