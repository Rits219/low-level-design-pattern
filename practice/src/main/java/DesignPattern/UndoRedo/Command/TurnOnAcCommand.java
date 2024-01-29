package DesignPattern.UndoRedo.Command;

import DesignPattern.UndoRedo.Receiver.AirConditioner;

public class TurnOnAcCommand implements Command{
    AirConditioner ac;

    public TurnOnAcCommand(AirConditioner ac){
        this.ac=ac;
    }


    @Override
    public void execute() {
        ac.turnOn();
    }

    @Override
    public void undo() {
        ac.turnOff();
    }
}
