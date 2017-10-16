package design.behavioural.mediator;

public class Client {
    Mediator mediator = new MediatorImpl();
    Participant participant1 = new ParticipantImpl(1, mediator, 10);
    Participant participant2 = new ParticipantImpl(2, mediator, 20);

    public void doStuff() {

        mediator.register(participant1);
        mediator.register(participant2);

        participant1.emit(); // code to interface.
    }
}
