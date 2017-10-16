package design.miscellaneous.iterator;

public class IteratorImpl implements Iterator {

    int max;
    int currentCount;

    public IteratorImpl(int min, int max) {
        currentCount = min;
        this.max = max;
    }

    public boolean hasNext() {
        return currentCount<max;
    }
    public int getNext() {
        currentCount++;
        return currentCount;
    }
}
