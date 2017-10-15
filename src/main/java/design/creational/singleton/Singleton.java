package design.creational.singleton;

public class Singleton implements Service {

    private static Singleton INSTANCE;
    static {
        INSTANCE = new Singleton();
    }

    private Singleton() {}
    public static Singleton getInstance() {
        return INSTANCE;
    }

    @Override
    public void doStuff() {
        // no-op
    }
}
