package solving.ds.related.ordered.globally.bst.ops_at_middle;

import java.util.Optional;

/**
 * Use {@link java.util.TreeSet}
 * @param <V>
 */
public interface BinarySearchTree<V extends Comparable<V>> {
    public void put(V value);
    public Optional<Node<V>> getElement(V value);
}
