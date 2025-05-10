package src.composite;

import java.util.List;

public interface NotificationTarget {

    void send(String message);

    void addTarget(NotificationTarget target);

    void removeTarget(NotificationTarget target);

    List<NotificationTarget> getTargets();
}
