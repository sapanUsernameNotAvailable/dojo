package solving.ds.related.ordered.locally.list;

import java.util.Optional;

public class LinkedListImpl<T> implements LinkedList<T> {

    int size = 0;
    Optional<Node<T>> start = Optional.empty();

    public int getSize() {
        return size;
    }

    public void insertAtLast(Node<T> element) {
        size++;
        if (!start.isPresent()) {
            start = Optional.of(element);
        } else {
            setAtEnd(start.get(), element);
        }
    }

    public void insertAtStart(Node<T> element) {
        size++;
        if (!start.isPresent()) {
            start = Optional.of(element);
        } else {
            element.setNext(start);
            start.get().setPrevious(Optional.of(element));
            start = Optional.of(element);
        }
    }

    public void removeLast() {
        if (size == 0) {
            throw new IllegalStateException();
        } else if (size == 1){
            size--;
            start = Optional.empty();
        } else  {
            size--;
            Node<T> counter = start.get();
            while (counter.getNext().isPresent()) {
                counter = counter.getNext().get();
            }
            // counter is last
            counter.getPrevious().get().setNext(Optional.empty());
        }
    }

    public void removeFirst() {
        if (size == 0) {
            throw new IllegalStateException();
        } else if (size == 1){
            size--;
            start = Optional.empty();
        } else  {
            size--;
            start = start.get().getNext();
            start.get().setPrevious(Optional.empty());
        }
    }

    public Node<T> getFirst() {
        if (size == 0) {
            throw new IllegalStateException();
        } else {
            return start.get();
        }
    }

    public Node<T> getLast() {
        if (size == 0) {
            throw new IllegalStateException();
        } else if (size == 1){
            return start.get();
        } else  {
            Node<T> counter = start.get();
            while (counter.getNext().isPresent()) {
                counter = counter.getNext().get();
            }
            // counter is last
            return counter;
        }
    }

    private void setAtEnd(Node<T> start, Node<T> toInsert) {
        Node<T> counter = start;
        while (counter.next.isPresent()) {
            counter = counter.next.get();
        }
        counter.next = Optional.of(toInsert);
        toInsert.setPrevious(Optional.of(counter));
    }
}
