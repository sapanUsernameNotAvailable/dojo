package design.miscellaneous.memento;

public class Product {

    int state;

    public Product(int state) {
        this.state = state;
    }

    public Product(Memento memento) {
        state = memento.getState();
    }

    public Memento getMemento() {
        return new Memento(state);
    }
}
