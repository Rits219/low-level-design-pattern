package DesignPattern.FlyWeightPattern.Problem;

public class Robot {
    int coordinateX;
    int coordinateY;
    RobotType type;
    String body;

    Robot(int x, int y, RobotType type, String body) {
        this.coordinateX = x;
        this.coordinateY = y;
        this.type = type;
        this.body = body;
    }

}
