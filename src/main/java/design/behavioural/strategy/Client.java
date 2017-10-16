package design.behavioural.strategy;

public class Client {

    Strategy strategy = new StrategyImpl();

    public void doStuff() {
        strategy.doStuff();
    }
}