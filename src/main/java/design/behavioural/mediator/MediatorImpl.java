package design.behavioural.mediator;

import java.util.LinkedList;
import java.util.List;

public class MediatorImpl implements Mediator{

    List<Participant> participants = new LinkedList<>();

    public void register(Participant participant) {
        participants.add(participant);
    }

    public void publish(int originatorId, int data) {
        participants.stream()
                .filter(participant -> participant.getId()!= originatorId)
                .forEach(participant -> participant.listen(originatorId, data));
    }


}
