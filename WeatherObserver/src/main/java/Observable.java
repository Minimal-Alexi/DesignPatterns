import java.util.ArrayList;

public class Observable {
    protected ArrayList<Observer> observers;
    public Observable() {
        observers = new ArrayList<>();
    }
    public synchronized void addObserver(Observer observer) {
        observers.add(observer);
    }
    public synchronized void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public synchronized void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
