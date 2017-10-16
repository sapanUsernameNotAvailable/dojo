package design.miscellaneous.iterator;

public class IterableImpl implements Iterable {

    int min;
    int max;

    public IterableImpl(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public Iterator getIterator() {
        return new IteratorImpl(min, max);
    }
}
