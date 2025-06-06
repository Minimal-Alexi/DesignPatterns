package commands;

import model.CanvasStatus;

public class MoveCursorLeftCommand implements Command {
    public CanvasStatus canvasStatus;
    public MoveCursorLeftCommand(CanvasStatus canvasStatus) {
        this.canvasStatus = canvasStatus;
    }
    @Override
    public void execute() {
        canvasStatus.setCursorPositionY(canvasStatus.getCursorPositionY() - 1);
    }
}
