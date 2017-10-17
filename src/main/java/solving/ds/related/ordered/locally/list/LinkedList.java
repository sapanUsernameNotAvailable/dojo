package solving.ds.related.ordered.locally.list;

/**
 * Use {@link java.util.LinkedList} instead.
 * @param <T>
 */
public interface LinkedList<T> {

    public int getSize();
    public void insertAtLast(Node<T> element);
    public void insertAtStart(Node<T> element);
    public void removeLast();
    public void removeFirst();
    public Node<T> getFirst();
    public Node<T> getLast();

}
