package src.chain;

// Approves medium-length leave requests (e.g., 4–7 days)
public class Manager extends LeaveRequestHandler {

    public static final int MANAGER_THRESHOLD = 7;

    @Override
    public void approve(int days) {
        if (days <= MANAGER_THRESHOLD) {
            System.out.println("A " + (days == 1 ? "day " : days + " days ") + "leave approved by the Manager.");
        } else if (nextHandler != null) {
            nextHandler.approve(days);
        }
    }
}
