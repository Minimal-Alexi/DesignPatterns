package controller;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import model.CanvasStatus;

public class PixelArtController {
    private final static int pixelSize = 16;
    private CanvasStatus canvasStatus;
    @FXML
    private VBox vBox;
    @FXML
    private Canvas canvasPixelArt;
    @FXML
    private Button buttonGenerateCode;
    public void initialize(){
        
    }
}
