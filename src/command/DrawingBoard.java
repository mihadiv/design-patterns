package src.command;

import java.util.ArrayList;
import java.util.List;

// Invoker
public class DrawingBoard {

    private List<DrawCommand> commands = new ArrayList<>();

    public void addCommand(DrawCommand drawCommand) {
        commands.add(drawCommand);
    }

    public void drawAll() {
        for (DrawCommand command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
