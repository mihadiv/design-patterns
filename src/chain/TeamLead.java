package src.chain;

// Approves short leave requests (e.g., 1–3 days)
public class TeamLead extends LeaveRequestHandler {

    public static final int TL_THRESHOLD = 3;

    @Override
    public void approve(int days) {
        if (days <= TL_THRESHOLD) {
            System.out.println("A " + (days == 1 ? "day " : days + " days ") + "leave approved by the Team Lead.");
        } else if (nextHandler != null) {
            nextHandler.approve(days);
        }
    }
}
