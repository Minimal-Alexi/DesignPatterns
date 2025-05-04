package controller;

import commands.*;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import model.CanvasStatus;

public class PixelArtController {
    private final static int pixelSize = 16;
    private CanvasStatus canvasStatus;
    private CommandInvoker commandInvoker;
    private GraphicsContext graphicsContext;
    @FXML
    private VBox vBox;
    @FXML
    private Canvas canvasPixelArt;
    @FXML
    private Button buttonGenerateCode;
    public void initialize(){
        canvasStatus = new CanvasStatus();
        refreshCanvas();
        commandInitialization();

    }
    private void commandInitialization(){
        GenerateCodeCommand generateCodeCommand = new GenerateCodeCommand(canvasStatus);
        MoveCursorDownCommand moveCursorDownCommand = new MoveCursorDownCommand(canvasStatus);
        MoveCursorLeftCommand moveCursorLeftCommand = new MoveCursorLeftCommand(canvasStatus);
        MoveCursorRightCommand moveCursorRightCommand = new MoveCursorRightCommand(canvasStatus);
        MoveCursorUpCommand moveCursorUpCommand = new MoveCursorUpCommand(canvasStatus);
        TogglePixelCommand togglePixelCommand = new TogglePixelCommand(canvasStatus);
        commandInvoker = new CommandInvoker(generateCodeCommand,moveCursorDownCommand,moveCursorUpCommand,
                moveCursorRightCommand,moveCursorLeftCommand,togglePixelCommand);
    }
    private void refreshCanvas(){

    }
    private void codeGenerator(){
        buttonGenerateCode.setOnAction(e -> {
            commandInvoker.generateCode();
        });
    }
    private void canvasUseInit(){

    }
}
