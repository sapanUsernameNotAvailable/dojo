package lang.threadpool;

public class ExecutorServiceFactory {
    public static ExecutorService getService(int threadCount) {
        return new ExecutorServiceImpl(threadCount);
    }
}
