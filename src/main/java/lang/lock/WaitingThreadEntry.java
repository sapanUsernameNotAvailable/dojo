package lang.lock;

public class WaitingThreadEntry {
    public void lock() throws InterruptedException{
        wait();
    }
    public void unlock() {
        notify();
    }
}
