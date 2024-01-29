package DesignPattern.FlyWeightPattern.Solution;

public class HumanoidRobot implements IRobot {
    String type;
    String body;

    public HumanoidRobot(String type, String body) {
        this.type = type;
        this.body = body;
    }

    @Override
    public void display(int x, int y) {
        //use this object to reder at x,y place
    }
}
