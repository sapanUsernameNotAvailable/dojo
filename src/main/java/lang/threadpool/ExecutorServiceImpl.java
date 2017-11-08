package lang.threadpool;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.IntStream;

public class ExecutorServiceImpl implements ExecutorService {

    private final List<Thread> consumers = new LinkedList<>();
    private final Queue<Runnable> tasks = new LinkedBlockingQueue<>();

    public ExecutorServiceImpl(int threadCount) {
        IntStream.range(0, threadCount).forEach(i -> consumers.add(new Worker(tasks)));
        consumers.stream().forEach(Thread::start);
    }

    public void submit(Runnable task) {
        synchronized (tasks) {  // 1. shared resource lock
            tasks.add(task);    // 2. producer
            tasks.notify();     // signal the monitor
        }
    }
}
