package DesignPattern.FlyWeightPattern.Solution;

public class Main {
    public static void main(String[] args) {
        IRobot dogRobot = RoboticFactory.createRobot("Dog");

        dogRobot.display(1, 2);
        IRobot dogRobot2 = RoboticFactory.createRobot("Dog");
        dogRobot2.display(10, 20);

    }
}
