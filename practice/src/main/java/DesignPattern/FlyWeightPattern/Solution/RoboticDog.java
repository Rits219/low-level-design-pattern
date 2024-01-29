package DesignPattern.FlyWeightPattern.Solution;

public class RoboticDog implements IRobot {
    String type;
    String body;

    public RoboticDog(String type, String body) {
        this.body = body;
        this.type = type;
    }

    @Override
    public void display(int x, int y) {
        //display
        System.out.println("displaying at x,y");
    }
}
