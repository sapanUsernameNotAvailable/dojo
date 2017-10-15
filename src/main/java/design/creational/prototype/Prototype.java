package design.creational.prototype;

public class Prototype implements Service {
    int data;

    public Prototype(int data) {
        this.data = data;
    }

    public Prototype getPrototype() {
        return new Prototype(this.data);
    }

    public void doStuff() {}
}
