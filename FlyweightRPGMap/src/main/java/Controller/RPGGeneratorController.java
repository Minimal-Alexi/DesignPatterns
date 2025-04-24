package Controller;

import Model.Logic.Map.CityMap;
import Model.Logic.Map.Map;
import Model.Logic.Map.WildernessMap;
import Model.Logic.Tiles.AbstractTile;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class RPGGeneratorController {
    private static final int tileSize = 16,maxMapSize = 30;
    private int mapSize;
    private Map map;
    private AbstractTile[][] tiles;
    private GraphicsContext gc;
    @FXML
    private Canvas canvasMapDisplay;
    @FXML
    private ChoiceBox<String> choiceBoxMapType;
    @FXML
    private TextField textFieldMapSize;
    @FXML
    private Button buttonGenerateMap;
    public void initialize(){
        graphicInitialization();
        canvasReset();
        choiceBoxInitialization();
        buttonGenerateMapInit();
    }
    private void graphicInitialization(){
        gc = canvasMapDisplay.getGraphicsContext2D();
    }
    private void canvasReset(){
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, canvasMapDisplay.getWidth(), canvasMapDisplay.getHeight());
    }
    private void choiceBoxInitialization(){
        choiceBoxMapType.getItems().clear();
        choiceBoxMapType.getItems().add("Wilderness Map");
        choiceBoxMapType.getItems().add("City Map");
        choiceBoxMapType.setValue("Wilderness Map");
    }
    private void buttonGenerateMapInit(){
        buttonGenerateMap.setOnAction(event -> {
            mapSize = Integer.parseInt(textFieldMapSize.getText());
            if(mapSize > maxMapSize){
                mapSize = maxMapSize;
            }
            if(choiceBoxMapType.getSelectionModel().getSelectedItem().equals("City Map")){
                map = new CityMap(mapSize);
            }else{
                map = new WildernessMap(mapSize);
            }
            tiles = map.getMap();
            drawCurrentMap();
        });
    }
    private void drawCurrentMap(){
        canvasReset();
        for(int i = 0; i < mapSize; i++){
            for(int j = 0; j < mapSize; j++){
                gc.drawImage(tiles[i][j].getImage().getImage(), j * tileSize, i * tileSize, tileSize, tileSize);
            }
        }
    }
}
