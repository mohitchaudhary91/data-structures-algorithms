package org.developer.patterns.behavioral.command;

public class TurnOffTVCommand implements ICommand {

    private final Television tv;

    public TurnOffTVCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOffTV();
    }

    @Override
    public void undo() {
        tv.turnOnTV();
    }
}
