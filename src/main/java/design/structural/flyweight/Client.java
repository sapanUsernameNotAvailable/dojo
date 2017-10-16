package design.structural.flyweight;

import java.util.Collection;
import java.util.LinkedList;

public class Client {

    Collection<Integer> lotOfStates = new LinkedList<>();
    Flyweight singleObject = new FlyweightImpl();

    public void doStuff() {
        lotOfStates.stream().forEach(state -> singleObject.doStuff(state)); // code to interface
    }
}
