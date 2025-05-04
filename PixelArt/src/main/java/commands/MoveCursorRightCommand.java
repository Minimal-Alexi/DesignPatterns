package commands;

import model.CanvasStatus;

public class MoveCursorRightCommand implements Command {
    public CanvasStatus canvasStatus;
    public MoveCursorRightCommand(CanvasStatus canvasStatus) {
        this.canvasStatus = canvasStatus;
    }
    @Override
    public void execute() {
        canvasStatus.setCursorPositionY(canvasStatus.getCursorPositionY() + 1);

    }
}
