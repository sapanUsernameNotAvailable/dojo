package lang.lock;

import java.util.LinkedList;
import java.util.List;

/**
 * Enqueues resource access requests.
 * Gives priority to waiting threads on first come first basis.
 */
public class FIFOLock {

    private boolean isSharedResourceAvailable = true;
    private List<WaitingThreadEntry> waitingThreads = new LinkedList<>();

    public synchronized void lockSharedResource() {
        if (isSharedResourceAvailable) {
            isSharedResourceAvailable = false;
            return;
        } else {
            WaitingThreadEntry threadEntry = new WaitingThreadEntry();
            waitingThreads.add(threadEntry);
            retryWaits(threadEntry);
        }
    }

    private void retryWaits(WaitingThreadEntry threadEntry) {
        try {
            threadEntry.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
            retryWaits(threadEntry);
        }
    }

    public synchronized void freeSharedResource() {
        isSharedResourceAvailable = true;
        if (!waitingThreads.isEmpty()) {
            waitingThreads.remove(0).notify();
        }
    }
}
