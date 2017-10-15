package design.structural.proxy;

public class Client {
    Service service = new Proxy();
    public void doStuff() {
        service.doStuff(); // code to interface
    }
}
