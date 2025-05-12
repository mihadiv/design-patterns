package src.observer;

import java.util.ArrayList;
import java.util.List;

//Observable
public abstract class WeatherStation {

    protected List<WeatherObserver> observers = new ArrayList<>();

    public void subscribe(WeatherObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (WeatherObserver o : observers) {
            o.receiveNotification(message);
        }
    }
}
