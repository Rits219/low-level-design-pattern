package DesignPattern.UndoRedo.Command;

import DesignPattern.UndoRedo.Receiver.AirConditioner;

public class TurnOffAcCommand implements Command{
    AirConditioner ac;

    public TurnOffAcCommand(AirConditioner ac){
        this.ac=ac;
    }


    @Override
    public void execute() {
        ac.turnOff();
    }

    @Override
    public void undo() {
        ac.turnOn();
    }
}
