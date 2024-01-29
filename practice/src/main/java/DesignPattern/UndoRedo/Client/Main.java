package DesignPattern.UndoRedo.Client;

import DesignPattern.UndoRedo.Command.TurnOffAcCommand;
import DesignPattern.UndoRedo.Command.TurnOnAcCommand;
import DesignPattern.UndoRedo.Invoker.RemoteControl;
import DesignPattern.UndoRedo.Receiver.AirConditioner;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        AirConditioner ac = new AirConditioner();

        remoteControl.setCommand(new TurnOnAcCommand(ac));
        remoteControl.pressButton();

        remoteControl.setCommand(new TurnOffAcCommand(ac));
        remoteControl.undo();
        remoteControl.undo();
        remoteControl.undo();
    }
}
