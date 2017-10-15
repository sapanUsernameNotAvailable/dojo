package design.structural.facade;

public class Client {

    Facade facade = new FacadeImpl();

    public void doStuff() {
        facade.doStuff(); // code to interface
    }
}
