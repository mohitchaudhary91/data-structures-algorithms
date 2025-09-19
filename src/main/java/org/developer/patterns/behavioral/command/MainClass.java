package org.developer.patterns.behavioral.command;

public class MainClass {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        AirConditioner ac = new AirConditioner();
        Television tv = new Television();
        TurnOnACCommand turnOnACCommand = new TurnOnACCommand(ac);
        TurnOffACCommand turnOffACCommand = new TurnOffACCommand(ac);
        TurnOnTVCommand turnOnTVCommand = new TurnOnTVCommand(tv);
        TurnOffTVCommand turnOffTVCommand = new TurnOffTVCommand(tv);

        remoteControl.reset();

        remoteControl.setButton(0, turnOnACCommand);
        remoteControl.setButton(1, turnOffACCommand);
        remoteControl.setButton(2, turnOnTVCommand);
        remoteControl.setButton(3, turnOffTVCommand);

        remoteControl.undo();
        System.out.println("--------------------");
        remoteControl.pressButton(0);
        remoteControl.undo();

        System.out.println("--------------------");
        remoteControl.pressButton(1);
        remoteControl.undo();

        System.out.println("--------------------");
        remoteControl.pressButton(2);
        remoteControl.undo();

        System.out.println("--------------------");
        remoteControl.pressButton(3);
        remoteControl.undo();
        System.out.println("--------------------");

        remoteControl.reset();
    }
}
