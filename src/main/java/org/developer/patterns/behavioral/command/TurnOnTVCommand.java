package org.developer.patterns.behavioral.command;

public class TurnOnTVCommand implements ICommand {

    private final Television tv;

    public TurnOnTVCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOnTV();
    }

    @Override
    public void undo() {
        tv.turnOffTV();
    }
}
