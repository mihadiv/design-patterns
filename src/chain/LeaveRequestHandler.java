package src.chain;

// Abstract handler for leave requests
public abstract class LeaveRequestHandler {

    protected LeaveRequestHandler nextHandler;

    public void setNextHandler(LeaveRequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void approve(int days);
}
