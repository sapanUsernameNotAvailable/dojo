package design.behavioural.chain;

import java.util.LinkedList;
import java.util.List;

public class Client {

    List<Strategy> chain = new LinkedList<>();

    public void doStuff() {
        chain.forEach(Strategy::doStuff); // code to interface
    }
}
