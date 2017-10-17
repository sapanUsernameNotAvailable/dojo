package solving.ds.related.ordered.locally.list;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListImplTest {
    @Test
    public void testDataCorrectness() throws Exception {

        LinkedList<Integer> list = new LinkedListImpl<>();

        Assert.assertTrue(list.getSize() == 0);

        // insertion count checks -> 3,4,5,6
        list.insertAtLast(new Node<>(4));
        Assert.assertTrue(list.getSize() == 1);
        list.insertAtLast(new Node<>(5));
        Assert.assertTrue(list.getSize() == 2);
        list.insertAtLast(new Node<>(6));
        Assert.assertTrue(list.getSize() == 3);
        list.insertAtStart((new Node<>(3)));
        Assert.assertTrue(list.getSize() == 4);


        // insertion data checks -> 3,..,6
        Assert.assertTrue(list.getFirst().getData() == 3);
        Assert.assertTrue(list.getLast().getData() == 6);

        // deletion count checks -> .,4,5,.
        list.removeLast();
        Assert.assertTrue(list.getSize() == 3);
        list.removeFirst();
        Assert.assertTrue(list.getSize() == 2);

        // deletion data checks
        Assert.assertTrue(list.getFirst().getData() == 4);
        Assert.assertTrue(list.getLast().getData() == 5);
    }
}
