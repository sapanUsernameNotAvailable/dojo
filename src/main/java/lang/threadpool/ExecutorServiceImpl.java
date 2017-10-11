package lang.threadpool;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class ExecutorServiceImpl implements ExecutorService {

    private final List<Thread> consumers = new LinkedList<>();
    private final Queue<Runnable> tasks = new LinkedBlockingQueue<>();

    public ExecutorServiceImpl(int threadCount) {
        for (int i = 0; i< threadCount; i++) {
            consumers.add(new Worker(tasks));
        }
        consumers.stream().forEach(Thread::start);
    }

    public void submit(Runnable task) {
        synchronized (tasks) {
            tasks.add(task);
            tasks.notify();
        }
    }
}
