package commands;

import model.CanvasStatus;

public class MoveCursorDownCommand implements Command {
    private CanvasStatus canvasStatus;
    public MoveCursorDownCommand(CanvasStatus canvasStatus) {
        this.canvasStatus = canvasStatus;
    }
    @Override
    public void execute() {
        canvasStatus.setCursorPositionX(canvasStatus.getCursorPositionX() + 1);
    }
}
