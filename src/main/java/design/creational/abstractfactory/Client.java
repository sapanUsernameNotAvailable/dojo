package design.creational.abstractfactory;

public class Client {
    ServiceFactory factory = new SpecificServiceTypeFactory();
    public void doStuff() {
        Service service = factory.getService(); // code to interfaces
        service.doStuff(); // code to interfaces
    }
}
