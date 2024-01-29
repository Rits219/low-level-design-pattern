package DesignPattern.UndoRedo.Receiver;

public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public void turnOn() {
        isOn = true;
        System.out.println("Ac is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Ac is off");
    }

    public void setTemperature(int temp) {
        temperature = temp;
        System.out.println("tempaerature is: " + temperature);
    }
}
