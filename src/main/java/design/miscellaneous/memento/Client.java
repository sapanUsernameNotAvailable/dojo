package design.miscellaneous.memento;

public class Client {
    public void doStuff() {
        Product original = new Product(5);
        Memento saved = original.getMemento(); // otherwise code to interface.
        Product restored = new Product(saved);
    }
}
