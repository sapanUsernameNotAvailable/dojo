package design.behavioural.state;

import java.util.HashMap;
import java.util.Map;

public class Client {

    Map<State,Strategy> stateToStrategy = new HashMap<>();
    State currentState = State.CANDIDATE_1;

    public Client() {
        stateToStrategy.put(State.CANDIDATE_1, new StrategyImpl());
    }

    public void doStuff() {
        stateToStrategy.get(currentState).doStuff(); // code to interface
    }
}
