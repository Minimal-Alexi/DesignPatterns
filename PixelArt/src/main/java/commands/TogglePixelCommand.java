package commands;

import model.CanvasStatus;

public class TogglePixelCommand implements Command {
    private CanvasStatus canvasStatus;
    public TogglePixelCommand(CanvasStatus canvasStatus) {
        this.canvasStatus = canvasStatus;
    }
    @Override
    public void execute() {

    }
}
