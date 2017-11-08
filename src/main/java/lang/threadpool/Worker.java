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

            synchronized (tasks) { // 1. shared resource lock
                handleNoJob();
                task = tasks.poll(); // 2. consumer
            }

            task.run(); // miscellaneous stuff - not related to sharing, locking etc.
        }
    }

    private void handleNoJob() {
        while (tasks.isEmpty()) { // while not if; just in case thread comes out of waiting for no reason.
            try {
                tasks.wait(); // wait for signal
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Deprecated
    /**
     * Use true to return control in caller. And try again. Results in busy wait.
     */
    private boolean deprecatedHandleNoJob() {
        return tasks.isEmpty();
    }
}
