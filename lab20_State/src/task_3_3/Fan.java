package task_3_3;

public class Fan {

  private State state = new LowState(this);

  public void setState(State state) {
    this.state = state;
  }

  public State getState() {
    return state;
  }

  public void turnUp() {
    state.turnUp();
  }

  public void turnDown() {
    state.turnDown();
  }

}
