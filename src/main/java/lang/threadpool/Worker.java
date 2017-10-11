package lang.threadpool;

import java.util.Optional;
import java.util.Queue;

public class Worker extends Thread {

    private final Queue<Runnable> tasks;
    public Worker(Queue<Runnable> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while (true) {

            Runnable task;

            synchronized (tasks) {
                while (tasks.isEmpty()) {
                    try {
                        tasks.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                task = tasks.poll();
            }

            task.run();
        }
    }
}
