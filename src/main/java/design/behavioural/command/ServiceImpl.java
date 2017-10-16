package design.behavioural.command;

public class ServiceImpl implements Service {
    public void doStuff(Command command) {
        command.doCommandOp();
    }
}
