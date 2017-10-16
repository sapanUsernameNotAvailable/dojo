package solving.ds.list;

import lombok.Data;

import java.util.Optional;

@Data
public class Node<T> {

    T data;

    public Node(T data) {
        this.data = data;
    }

    Optional<Node<T>> previous = Optional.empty();
    Optional<Node<T>> next = Optional.empty();
}
