import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation {
    private List<Observer> observers;
    private Random rand = new Random();
    private float temperature;
    private String weather;
    public WeatherStation() {
        observers = new ArrayList<Observer>();
        temperature = rand.nextFloat(-20,20);
        generateWeather();
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
    public void run()
    {

    }
    private void generateWeather() {
        int weatherValue = rand.nextInt(3);
        switch (weatherValue) {
            case 0:
            {
                weather = "Sunny";
                break;
            }
            case 1:
            {
                weather = "Cloudy";
                break;
            }
            case 2:
            {
                weather = "Rainy";
                break;
            }
        }
    }
}
