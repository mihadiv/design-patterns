package src.command;

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
