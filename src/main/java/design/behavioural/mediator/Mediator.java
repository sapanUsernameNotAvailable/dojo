package design.behavioural.mediator;

public interface Mediator {
    public void register(Participant participant);
    public void publish(int originatorId, int data);
}
