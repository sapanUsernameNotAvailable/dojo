package design.behavioural.observer;

import java.util.LinkedList;
import java.util.List;

public class Client {

    Subject subject = new SubjectImpl();
    Client() {
        subject.subscribe(new ObserverImpl1());
        subject.subscribe(new ObserverImpl2());
    }

    public void doStuff() {
        subject.notifyObservers(); // code to interface
    }
}
