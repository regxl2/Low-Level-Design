package _22_command_pattern;

import _22_command_pattern.command.ICommand;

import java.util.Stack;

// This is an invoker

public class MyRemoteControl {
    private ICommand command;
    private final Stack<ICommand> history;

    public MyRemoteControl(){
        history = new Stack<>();
    }

    public void setCommand(ICommand command){
        this.command = command;
    }

    public void execute(){
        command.execute();
        history.push(command);
    }

    public void undo(){
        if(!history.empty()){
            ICommand prevCommand = history.pop();
            prevCommand.undo();
        }
    }
}
