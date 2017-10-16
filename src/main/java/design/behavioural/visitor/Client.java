package design.behavioural.visitor;

import java.util.LinkedList;
import java.util.List;

public class Client {

    List<Visitable> visitables = new LinkedList<>();
    Visitor visitor = new VisitorImpl();

    public Client() {
        visitables.add(new Visitable1());
        visitables.add(new Visitable2());
    }

    public void doStuff() {
        visitables.stream().forEach(visitable -> visitor.visit(visitable)); // code to interface.
    }
}
