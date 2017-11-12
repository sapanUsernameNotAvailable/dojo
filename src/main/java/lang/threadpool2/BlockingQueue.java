package lang.threadpool2;

import java.util.LinkedList;
import java.util.List;

/**
 * Doesn't throw Exceptions on underflows and overflows.
 * Instead, blocks. Intended for multi-threaded scenarios.
 */
public class BlockingQueue<TYPE> {

    List<TYPE> list = new LinkedList<>();
    private final int THRESHOLD;

    public BlockingQueue(int THRESHOLD) {
        this.THRESHOLD = THRESHOLD;
    }

    public synchronized void add(TYPE data) throws InterruptedException {
        while (list.size() == THRESHOLD) { wait();}
        list.add(data);
        if (list.size() == 1) {notifyAll();}
    }

    public synchronized TYPE get() throws InterruptedException {
        while (list.isEmpty()) {wait();}
        TYPE result = list.remove(0);
        if (list.size() == THRESHOLD-1) {notifyAll();}
        return result;
    }
}
