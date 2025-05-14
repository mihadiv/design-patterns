package src.composite;

import java.util.ArrayList;
import java.util.List;

// Composite
public class NotificationGroup implements NotificationTarget {

    private List<NotificationTarget> targets = new ArrayList<>();

    @Override
    public void send(String message) {
        for (NotificationTarget target : targets) {
            target.send(message);
        }
    }

    @Override
    public void addTarget(NotificationTarget target) {
        targets.add(target);
    }

    @Override
    public void removeTarget(NotificationTarget target) {
        targets.remove(target);
    }

    @Override
    public List<NotificationTarget> getTargets() {
        return List.copyOf(targets);
    }
}
