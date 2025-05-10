package src.composite;

import java.util.List;

public class UserDevice implements NotificationTarget {

    private String deviceName;

    public UserDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void send(String message) {
        System.out.println("[" + deviceName + "] received: " + message);
    }

    @Override
    public void addTarget(NotificationTarget target) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeTarget(NotificationTarget target) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<NotificationTarget> getTargets() {
        throw new UnsupportedOperationException();
    }
}
