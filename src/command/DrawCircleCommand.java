package src.command;

// Concrete Command
public class DrawCircleCommand implements DrawCommand {

    private Canvas canvas;

    public DrawCircleCommand(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void execute() {
        canvas.drawCircle();
    }
}
