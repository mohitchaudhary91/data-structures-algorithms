package org.developer.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoteControl {

    private List<ICommand> buttons;
    private Stack<ICommand> commandsList;

    public RemoteControl() {
        this.buttons = new ArrayList<>();
        this.commandsList = new Stack<>();
        System.out.println("Remote control has four buttons");
    }

    public void setButton(int num, ICommand command) {
        buttons.add(num, command);
    }

    public void pressButton(int num) {
        ICommand command = buttons.get(num);
        command.execute();
        commandsList.push(command);
    }

    public void undo() {
        if (!commandsList.empty()) {
            ICommand lastCommand = commandsList.pop();
            lastCommand.undo();
        } else {
            System.out.println("No last command");
        }
    }

    public void reset() {
        buttons.clear();
        commandsList.clear();
    }
}
