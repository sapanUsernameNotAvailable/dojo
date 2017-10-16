package design.behavioural.observer;

import java.util.LinkedList;
import java.util.List;

public class SubjectImpl implements Subject {

    List<Observer> observers = new LinkedList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        observers.stream().forEach(Observer::doStuff);
    }
}
