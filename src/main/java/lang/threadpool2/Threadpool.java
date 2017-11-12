package lang.threadpool2;

import java.util.Collection;
import java.util.stream.IntStream;

/**
 * Has better separation of concerns.
 */
public class Threadpool {

    BlockingQueue<Runnable> tasks;
    Collection<Thread> workers;

    public Threadpool(int queueThreshold, int workerCount) {
        this.tasks = new BlockingQueue<>(queueThreshold);
        IntStream.range(0,workerCount).forEach(i -> workers.add(new WorkerThread(tasks)));
        workers.stream().forEach(worker -> worker.start());
    }

    public synchronized void submit(Runnable task) {
        try {
            tasks.add(task);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
