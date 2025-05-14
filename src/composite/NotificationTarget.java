package src.composite;

import java.util.List;

// Component
public interface NotificationTarget {

    void send(String message);

    void addTarget(NotificationTarget target);

    void removeTarget(NotificationTarget target);

    List<NotificationTarget> getTargets();
}
