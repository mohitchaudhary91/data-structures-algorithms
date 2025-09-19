package org.developer.patterns.behavioral.command;

public class TurnOffACCommand implements ICommand {

    private final AirConditioner ac;

    public TurnOffACCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
