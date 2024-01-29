package DesignPattern.UndoRedo.Command;

public interface Command {
    public void execute();

    public void undo();
}
