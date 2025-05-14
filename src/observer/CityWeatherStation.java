package src.observer;

// ConcreteObservable (ConcreteSubject)
public class CityWeatherStation extends WeatherStation {

    private String cityName;

    public CityWeatherStation(String cityName) {
        this.cityName = cityName;
    }

    public void updateWeather(String report) {
        notifyObservers("[" + cityName + "] Weather update: " + report);
    }
}
