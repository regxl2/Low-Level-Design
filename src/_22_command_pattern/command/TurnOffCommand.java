package _22_command_pattern.command;

import _22_command_pattern.AirConditioner;

public class TurnOffCommand implements ICommand{

    private final AirConditioner airConditioner;

    public TurnOffCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOffAc();
    }

    @Override
    public void undo() {
        airConditioner.turnOnAc();
    }
}
