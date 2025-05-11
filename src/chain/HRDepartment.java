package src.chain;

// Approves any leave request beyond manager's authority
public class HRDepartment extends LeaveRequestHandler {

    @Override
    public void approve(int days) {
        System.out.println("A " + (days == 1 ? "day " : days + " days ") + "leave approved by the HR Department.");
    }
}
