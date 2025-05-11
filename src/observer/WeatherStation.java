package src.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

//Observable
public abstract class WeatherStation {

    protected List<WeatherObserver> observers = new ArrayList<>();

    public void subscribe(WeatherObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void notifiObservers(String message) {
        for (WeatherObserver o : observers) {
            o.receiveNotification(message);
        }
    }
}
