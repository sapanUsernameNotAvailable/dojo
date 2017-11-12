package lang.threadpool2;

public class WorkerThread extends Thread {

    BlockingQueue<Runnable> tasks;

    public WorkerThread(BlockingQueue<Runnable> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while (true){
            try {
                tasks.get().run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
