package design.creational.builder;

public class Client {
    public void doStuff() {
        Service service = new Builder().withProperty(5).build();
        service.doStuff();
    }
}
