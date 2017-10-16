package design.behavioural.command;

public class Client {

    Command command = new CommandImpl(4);
    Service service = new ServiceImpl();

    public void doStuff() {
        service.doStuff(command); // code to interface.
    }
}
