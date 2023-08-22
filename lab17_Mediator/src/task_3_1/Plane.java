package task_3_1;

/**
 * Літак
 */
public class Plane {

  private boolean isInTheAir;
  private final int id;
  private final Mediator mediator;


  public Plane(int id, Mediator mediator) {
    this.id = id;
    this.mediator = mediator;
    isInTheAir = false;
    ((FlightControlMediator) mediator).addPlane(this);
  }

  /**
   * Зліт літака
   */
  public void takeOff() {
    mediator.notify(Event.TAKE_OFF, id);
  }

  /**
   * Приземлення літака
   */
  public void land() {
    mediator.notify(Event.LAND, id);
  }

  /**
   * Повертає ознаку чи літак в повітрі
   * @return стан літака - чи в повітрі
   */
  public boolean getIsInTheAir() {
    return isInTheAir;
  }

  /**
   * Встановити ознаку чи злетів літак
   * @param isInTheAir чи злетів літак
   */
  public void setIsInTheAir(boolean isInTheAir) {
    this.isInTheAir = isInTheAir;
  }

  /**
   * Ідентифікатор літака
   * @return ідентифікатор
   */
  public int getId() {
    return id;
  }
}
