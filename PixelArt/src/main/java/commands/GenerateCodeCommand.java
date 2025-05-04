package commands;

import model.CanvasStatus;

public class GenerateCodeCommand implements Command {
    private CanvasStatus canvasStatus;
    public GenerateCodeCommand(CanvasStatus canvasStatus) {
        this.canvasStatus = canvasStatus;
    }
    @Override
    public void execute() {
        System.out.println(canvasStatus.getCanvasCode());
    }
}
