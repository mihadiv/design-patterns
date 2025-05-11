package src.observer;

public class CityWeatherStation extends WeatherStation {

    private String cityName;

    public CityWeatherStation(String cityName) {
        this.cityName = cityName;
    }

    public void updateWeather(String report) {
        notifiObservers("[" + cityName + "] Weather update: " + report);
    }
}
