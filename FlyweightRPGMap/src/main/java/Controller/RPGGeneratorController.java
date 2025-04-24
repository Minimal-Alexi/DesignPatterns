package Controller;

import Model.Logic.Tiles.AbstractTile;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class RPGGeneratorController {
    private static final int tileSize = 16,maxMapSize = 30;
    private AbstractTile[][] tiles;
    @FXML
    private Canvas canvasMapDisplay;
    @FXML
    private ChoiceBox<String> choiceBoxMapType;
    @FXML
    private TextField textFieldMapSize;
    @FXML
    private Button buttonGenerateMap;
    public void initialize(){

    }
    public void canvasInitialization(){

    }
}
