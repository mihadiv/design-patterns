package src.command;

// Concrete Command
public class DrawRectangleCommand implements DrawCommand {

    private Canvas canvas;

    public DrawRectangleCommand(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void execute() {
        canvas.drawRectangle();
    }
}
