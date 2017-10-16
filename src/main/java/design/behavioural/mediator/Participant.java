package design.behavioural.mediator;

public interface Participant {
    public int getId();
    public void emit();
    public void listen(int originator, int data);
}
