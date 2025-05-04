package controller;

import commands.Command;

public class CommandInvoker {
    private final Command generateCodeCommand, moveDownCommand,moveUpCommand,moveRightCommand,moveLeftCommand,
            togglePixelCommand;
    public CommandInvoker(Command generateCodeCommand,Command moveDownCommand,Command moveUpCommand,
                          Command moveRightCommand,Command moveLeftCommand,
                          Command togglePixelCommand) {
        this.generateCodeCommand = generateCodeCommand;
        this.moveDownCommand = moveDownCommand;
        this.moveUpCommand = moveUpCommand;
        this.moveRightCommand = moveRightCommand;
        this.moveLeftCommand = moveLeftCommand;
        this.togglePixelCommand = togglePixelCommand;
    }
    public void generateCode(){
        generateCodeCommand.execute();
    }
    public void moveDown(){
        moveDownCommand.execute();
    }
    public void moveUp(){
        moveUpCommand.execute();
    }
    public void moveRight(){
        moveRightCommand.execute();
    }
    public void moveLeft(){
        moveLeftCommand.execute();
    }
    public void togglePixel(){
        togglePixelCommand.execute();
    }
}
