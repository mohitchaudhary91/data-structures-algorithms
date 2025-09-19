package org.developer.patterns.behavioral.command;

public class TurnOnACCommand implements ICommand {

    private final AirConditioner ac;

    public TurnOnACCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
