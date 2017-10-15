package design.creational.singleton;

public class Client {

    Service service = Singleton.getInstance();
    public void doStuff() {
        service.doStuff(); // code to interface.
    }
}
