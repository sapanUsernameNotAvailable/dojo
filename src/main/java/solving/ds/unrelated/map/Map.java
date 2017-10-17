package solving.ds.unrelated.map;

import java.util.Optional;

/**
 * Use {@link java.util.HashMap}
 * @param <K>
 * @param <V>
 */
public interface Map<K,V> {
    public void put(K key, V value);
    public Optional<V> get(K key);
}
