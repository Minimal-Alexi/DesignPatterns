import java.util.ArrayList;

public class Observable {
    protected ArrayList<Observer> observers;
    public Observable() {
        observers = new ArrayList<>();
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
