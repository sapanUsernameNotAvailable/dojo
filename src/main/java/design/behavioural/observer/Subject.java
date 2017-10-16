package design.behavioural.observer;

public interface Subject {
    public void subscribe(Observer observer);
    public void notifyObservers();
}
