package src.observer;

// ConcreteObserver
public class WeatherAppClient implements WeatherObserver {

    @Override
    public void receiveNotification(String weatherReport) {
        System.out.println("Notification: " + weatherReport);
    }
}
