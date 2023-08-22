package task_3_3;

public abstract class State {
      Fan context;

      public State(Fan context) {
          this.context = context;
      }

      abstract void turnUp();
      abstract void turnDown();
}
