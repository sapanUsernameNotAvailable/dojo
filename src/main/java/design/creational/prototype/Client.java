package design.creational.prototype;

public class Client {
    public void doStuff() {
        Prototype original = new Prototype(4);
        Service service = original.getPrototype();
        service.doStuff(); // code to interface
    }
}
