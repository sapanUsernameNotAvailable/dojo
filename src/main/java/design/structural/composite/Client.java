package design.structural.composite;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Client {

    List<Composable> composables = new LinkedList<>(Arrays.asList(new SmallNode(), new LargeNode()));

    public void doStuff() {
        composables.stream().forEach(Composable::getWeight); // code to interfaces
    }
}
