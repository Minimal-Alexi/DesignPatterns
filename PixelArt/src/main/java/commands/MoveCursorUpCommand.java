package commands;

import model.CanvasStatus;

public class MoveCursorUpCommand implements Command {
    private CanvasStatus canvasStatus;
    public MoveCursorUpCommand(CanvasStatus canvasStatus) {
        this.canvasStatus = canvasStatus;
    }
    @Override
    public void execute() {
        canvasStatus.setCursorPositionX(canvasStatus.getCursorPositionX() - 1);
    }
}
