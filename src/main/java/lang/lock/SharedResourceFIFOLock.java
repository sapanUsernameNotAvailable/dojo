package lang.lock;

import java.util.LinkedList;
import java.util.List;

/**
 * Enqueues resource access requests.
 * Gives priority to waiting threads on first come first basis.
 * Better to use a linked blocking queue of runnables instead and use a threadpool.
 * Because Runnables are better suited for task definitions which must not be starved.
 * Threads are simply executing mechanisms.
 */
public class SharedResourceFIFOLock {

    private boolean isSharedResourceAvailable = true;
    private List<WaitingThreadEntry> waitingThreads = new LinkedList<>();
    private CoordinatingAttributesLock attributesLock;

    public void lockSharedResource() throws InterruptedException {
        attributesLock.lock();

        if (isSharedResourceAvailable) {
            isSharedResourceAvailable = false;
            attributesLock.unlock();
            return;
        }
        WaitingThreadEntry threadEntry = new WaitingThreadEntry();
        waitingThreads.add(threadEntry);
        attributesLock.unlock();
        try {
            threadEntry.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
            attributesLock.lock();
            waitingThreads.remove(threadEntry);
            attributesLock.unlock();
        }
    }

    public void freeSharedResource() throws InterruptedException {
        attributesLock.lock();
        isSharedResourceAvailable = true;
        if (!waitingThreads.isEmpty()) {
            waitingThreads.remove(0).notify();
        }
        attributesLock.unlock();
    }
}
