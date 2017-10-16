package design.miscellaneous.iterator;

public class Client {
    public void doStuff() {

        Iterable iterable = new IterableImpl(0,5);
        Iterator iterator = iterable.getIterator();

        while (iterator.hasNext()) { // code to interface
            iterator.getNext();
        }
    }
}
