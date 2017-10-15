package design.creational.factory;

public class Client {
    Factory factory = new Factory();
    public void doStuff() {
        Service service = factory.getProduct();
        service.doStuff(); // code to interface
    }
}
