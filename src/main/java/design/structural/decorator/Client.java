package design.structural.decorator;

public class Client {

    public void doLegacyStuff() {
        Service service = new DecoratorImpl(new ServiceImpl());
        service.doStuff(); // code to interface.
    }

    public void doNewStuff() {
        Decorator decorator = new DecoratorImpl(new ServiceImpl());
        decorator.doExtraStuff(); // code to interface
    }
}
