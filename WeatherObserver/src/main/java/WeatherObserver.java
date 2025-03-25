public class WeatherObserver implements Observer {
    private int id;
    private final WeatherStation station;
    public WeatherObserver(int id,WeatherStation station) {
        this.id = id;
        this.station = station;
    }
    public void update(){
        System.out.println("Observer " + id + ": " + station.getTemperature() +" , the weather is currently: " + station.getWeather());
    }

}
