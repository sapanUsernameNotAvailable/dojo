package design.behavioural.mediator;

public class ParticipantImpl implements Participant {

    int id;
    Mediator mediator;
    int data;

    public ParticipantImpl(int id, Mediator mediator, int data) {
        this.id = id;
        this.mediator = mediator;
        this.data = data;
    }

    public int getId() {
        return id;
    }
    public void emit() {
        mediator.publish(id, data);
    }
    public void listen(int originator, int data) {
        // do stuff
    }
}
