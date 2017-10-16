package design.behavioural.command;

public class CommandImpl implements Command{
    int data;

    public CommandImpl(int data) {
        this.data = data;
    }
    public void doCommandOp() {}
}
