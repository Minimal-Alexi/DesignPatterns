import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation extends Observable {
    private final Random rand = new Random();
    private float temperature;
    private String weather;
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
