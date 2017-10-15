package design.structural.composite;

public class LargeNode implements Composable {

    Composable small1 = new SmallNode();
    Composable small2 = new SmallNode();

    public int getWeight() {
        return small1.getWeight() + small2.getWeight();
    }
}
