package task_3_1;

import java.util.ArrayList;

/**
 * Літаки, що приземлилися
 */
public class PlanesOnGround {

  ArrayList<Plane> planes = new ArrayList<>();

  public void addPlane(Plane plane) {
    planes.add(plane);
  }

  public void removePlane(Plane plane) {
    planes.remove(plane);
  }

}
