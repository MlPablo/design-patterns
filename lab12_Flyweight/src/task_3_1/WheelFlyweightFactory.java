package task_2_2;

import java.util.HashMap;
import java.util.Map;

public class WheelFlyweightFactory {
    private final Map<String, Wheel> wheelCache = new HashMap<>();

    public Wheel getWheel(int diameter) {
        String key = diameter + Wheel.Material.Steel.toString();
        Wheel wheel = wheelCache.get(key);
        if (wheel == null) {
            wheel = new Wheel(diameter);
            wheelCache.put(key, wheel);
        }
        return wheel;
    }
}
