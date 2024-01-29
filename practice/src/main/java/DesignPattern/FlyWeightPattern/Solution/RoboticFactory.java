package DesignPattern.FlyWeightPattern.Solution;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
    static Map<String, IRobot> roboticObjectCache = new HashMap<>();

    static IRobot createRobot(String robotType) {
        if (roboticObjectCache.containsKey(robotType)) {
            return roboticObjectCache.get(robotType);
        }

        if (robotType.equals("Humanoid")) {
            IRobot humanoidRobot = new HumanoidRobot(robotType, "dummy body");
            roboticObjectCache.put(robotType, humanoidRobot);
            return humanoidRobot;
        }

        if (robotType.equals("Dog")) {
            IRobot humanoidRobot = new HumanoidRobot(robotType, "dummy body");
            roboticObjectCache.put(robotType, humanoidRobot);
            return humanoidRobot;
        }
        return null;
    }
}
