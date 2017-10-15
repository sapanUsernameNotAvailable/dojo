package design.structural.proxy;

public class Proxy implements Service {

    Downstream downstream = new Downstream();
    public void doStuff() {
        // proxy stuff
        downstream.doStuff();
    }
}
