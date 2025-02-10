package _22_command_pattern.command;

import _22_command_pattern.AirConditioner;

public class TurnOnCommand implements ICommand{

    private final AirConditioner airConditioner;

    public TurnOnCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOnAc();
    }

    @Override
    public void undo() {
        airConditioner.turnOffAc();
    }
}
