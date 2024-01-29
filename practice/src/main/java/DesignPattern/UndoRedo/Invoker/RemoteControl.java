package DesignPattern.UndoRedo.Invoker;

import DesignPattern.UndoRedo.Command.Command;

import java.util.Stack;

public class RemoteControl {
    Command command;
    Stack<Command> stack;

    public RemoteControl() {
        stack=new Stack<>();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        stack.push(command);
        command.execute();
    }

    public void undo() {
        if (stack.empty()) {
            System.out.println("do nothing");
            return;
        }
        Command myCommand = stack.pop();
        myCommand.undo();
    }

}
