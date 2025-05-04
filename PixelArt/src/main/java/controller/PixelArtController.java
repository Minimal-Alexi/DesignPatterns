package controller;

import commands.*;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import model.CanvasStatus;

public class PixelArtController {
    private final static int pixelSize = 64;
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
        graphicsContext = canvasPixelArt.getGraphicsContext2D();
        canvasStatus = new CanvasStatus(this);
        commandInitialization();

    }
    public void refreshCanvas(boolean[][] canvas,int cursorX,int cursorY){
        for(int i = 0; i < canvas.length; i++){
            for(int j = 0; j < canvas[i].length; j++){
                if(canvas[i][j]){
                    graphicsContext.setFill(Color.DARKGREEN);
                }
                else {
                    graphicsContext.setFill(Color.BLACK);
                }
                graphicsContext.fillRect(j*pixelSize,i*pixelSize,pixelSize,pixelSize);
            }
        }
        graphicsContext.setStroke(Color.WHITE);
        graphicsContext.strokeRect(cursorX*pixelSize,cursorY*pixelSize,pixelSize,pixelSize);
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
    private void codeGenerator(){
        buttonGenerateCode.setOnAction(e -> {
            commandInvoker.generateCode();
        });
    }
    private void canvasUseInit(){

    }
}
