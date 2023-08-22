package task_3_2;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

    final private List<String> tracks = new ArrayList<>();
    private State state = new StoppedState(this);
    private int currentTrackNum = 0;


    public String getCurrentTrack() {
        return tracks.get(currentTrackNum);
    }

    public void setTrackNum(int trackNum) {
        if (trackNum < 0 || trackNum >= tracks.size()) {
            return;
        }

        this.currentTrackNum = trackNum;
    }

    public int getCurrentTrackNum() {
        return currentTrackNum;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void addTrack(String track) {
        tracks.add(track);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void play() {
        state.play();
    }

    public void pause() {
        state.pause();
    }

    public void next() {
        state.next();
    }

    public void prev() {
        state.prev();
    }

    public void stop() {
        state.stop();
    }

}
