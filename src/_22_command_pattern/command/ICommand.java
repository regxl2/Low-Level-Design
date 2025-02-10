package _22_command_pattern.command;

// This is command
public interface ICommand {
    public void execute();
    public void undo();
}
