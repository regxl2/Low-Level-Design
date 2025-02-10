package _22_command_pattern;

// Problem it solves

// * Lack of abstraction -> Today, the process turning is AC is straightforward, but if there were more steps,
// a client has to be aware of all that, which is not good.

// * Undo/Redo functionality -> what if I have to implement undo/redo functionality, how it will handle.

// * Difficulty in code maintenance -> What if we have to support more commands for more devices example - bulb.



// Command pattern solves this problem by separating the logic of:
// 1. Invoker
// 2. Receiver
// 3. Command


import _22_command_pattern.command.ICommand;
import _22_command_pattern.command.TurnOffCommand;
import _22_command_pattern.command.TurnOnCommand;

public class Demo {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        ICommand turnOffCommand = new TurnOffCommand(airConditioner);
        ICommand turnOnCommand = new TurnOnCommand(airConditioner);
        MyRemoteControl remoteControl = new MyRemoteControl();
        remoteControl.setCommand(turnOnCommand);
        remoteControl.execute();
        remoteControl.setCommand(turnOffCommand);
        remoteControl.execute();
        remoteControl.undo();
    }
}
