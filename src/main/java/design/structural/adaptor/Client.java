package design.structural.adaptor;

public class Client {
    RequiredService service = new Adaptor();
    public void doMyStuff() {
        service.doStuff(); // code to interface
    }
}
