import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class WeatherStation extends Observable {
    private final Random rand = new Random();
    private float temperature;
    private String weather;
    private Timer timerTemp;
    public WeatherStation() {
        super();
        temperature = rand.nextFloat(-20,20);
        generateWeather();
    }
    public float getTemperature() {
        return temperature;
    }
    public String getWeather() {
        return weather;
    }
    public void start() {
        timerTemp = new Timer();
        timerTemp.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                temperature += rand.nextFloat() * 10 - 5;
                generateWeather();
                notifyObservers();
            }
        }, 0, 5000);
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
    public void stop() {
        timerTemp.cancel();
    }

}
