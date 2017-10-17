package solving.ds.related.ordered.globally.heap.ops_at_extremes;

/**
 * Used {@link java.util.PriorityQueue}
 * @param <V>
 */
public interface Heap<V extends Comparable<V>> {
    public void put(V object);
    public V getMinimum();
    public boolean isEmpty();
}
