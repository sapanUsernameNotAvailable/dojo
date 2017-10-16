package design.behavioural.visitor;

public class VisitorImpl implements Visitor{
    public void visit(Visitable visitable) {
        if (visitable instanceof Visitable1) {
            // visitable1 strategy
        } else if (visitable instanceof Visitable2) {
            // visitable2 strategy
        } else {
            throw new IllegalArgumentException(visitable.toString());
        }
    }
}
