package design.structural.decorator;

public class DecoratorImpl implements Decorator {

    Service service;
    public DecoratorImpl(Service service) {
        this.service = service;
    }

    public void doStuff() {
        service.doStuff();
    }

    public void doExtraStuff() {
        // decorator stuff
    }
}
