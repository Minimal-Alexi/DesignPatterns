import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherObserver observer1 = new WeatherObserver(1,station),observer2 = new WeatherObserver(2,station),observer3 = new WeatherObserver(3,station);
        station.addObserver(observer1);
        station.addObserver(observer2);
        station.addObserver(observer3);
        station.start();
        Timer removalTimer = new Timer();
        removalTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                station.stop();
                station.removeObserver(observer3);
                System.out.println("Observer 3 removed after 20 seconds.");
                removalTimer.cancel();
                station.start();
            }
        }, 20000);

    }
}
