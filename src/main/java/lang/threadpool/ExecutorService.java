package lang.threadpool;

public interface ExecutorService {
    public void submit(Runnable task);
}
