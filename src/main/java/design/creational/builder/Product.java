package design.creational.builder;

public class Product implements Service {

    int data;

    public Product(int data) {
        this.data = data;
    }

    public void doStuff() {
        // no op
    }
}
