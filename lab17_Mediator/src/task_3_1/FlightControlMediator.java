package task_3_1;

import java.util.HashMap;

public class FlightControlMediator implements Mediator {
    private final HashMap<Integer, Plane> planes;
    private final PlanesInFlight planesInFlight;
    private final PlanesOnGround planesOnGround;
    private final Runway runway;

    public FlightControlMediator() {
        planes = new HashMap<>();
        planesInFlight = new PlanesInFlight();
        planesOnGround = new PlanesOnGround();
        runway = new Runway();
    }

    @Override
    public void notify(Event event, int planeId) {
        switch (event) {
            case TAKE_OFF -> takeOff(planeId);
            case LAND -> land(planeId);
            default -> throw new IllegalArgumentException("Unknown event: " + event);
        }
    }

    public void addPlane(Plane plane) {
        planes.put(plane.getId(), plane);
        planesOnGround.addPlane(plane);
    }

    private void takeOff(int planeId) {
        Plane plane = planes.get(planeId);
        if (plane != null && !plane.getIsInTheAir() && runway.getIsAvailable()) {
            System.out.println("Plane " + planeId + " is taking off...");
            planesOnGround.removePlane(plane);
            planesInFlight.addPlane(plane);
            plane.setIsInTheAir(true);
            runway.setIsAvailable(false);
        }
    }

    private void land(int planeId) {
        Plane plane = planes.get(planeId);
        if (plane != null && plane.getIsInTheAir() && runway.getIsAvailable()) {
            System.out.println("Plane " + planeId + " is landing...");
            planesInFlight.removePlane(plane);
            planesOnGround.addPlane(plane);
            plane.setIsInTheAir(false);
            runway.setIsAvailable(false);
        }
    }
}
