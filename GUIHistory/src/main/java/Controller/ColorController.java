package Controller;

import Model.IMemento;
import Model.State;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class ColorController {
    private State state;
    private ArrayList<IMemento> stateHistory;
    @FXML
    private Rectangle rectangle1, rectangle2, rectangle3;
    @FXML
    private CheckBox checkboxSelected;
    @FXML
    private VBox scene;
    public void initialize() {
        state = new State();
        stateHistory = new ArrayList<>();
        rectangleInitialization(rectangle1,1);
        rectangleInitialization(rectangle2,2);
        rectangleInitialization(rectangle3,3);
        checkboxInitialization();
        keyboardListenInitialization();

        stateHistory.add(state.createMemento());

    }
    private void undo(){
        if(!stateHistory.isEmpty()){
            System.out.println("Memento found in history");
            IMemento previousState = stateHistory.remove(stateHistory.size() - 1);
            state.restoreState(previousState);
            updateGUI();
        }
    }

    private void rectangleInitialization(Rectangle rectangle, int rectangleOption) {
        rectangle.setFill(state.getOption(rectangleOption));
        rectangle.setOnMouseClicked(event -> {
            int currentIndex = state.getColorBoxes()[rectangleOption - 1].getColorIndex();

            int nextIndex = (currentIndex + 1) % 3;

            state.setOptionChoice(rectangleOption, nextIndex);
            rectangle.setFill(state.getOption(rectangleOption));
            stateHistory.add(state.createMemento());
        });
    }
    private void checkboxInitialization() {
        state.setSelected(checkboxSelected.isSelected());
        checkboxSelected.setOnAction(event -> {
            state.setSelected(checkboxSelected.isSelected());
            stateHistory.add(state.createMemento());
        });
    }
    private void keyboardListenInitialization(){
        scene.setOnKeyPressed(event -> {
            if (event.isControlDown() && event.getCode() == KeyCode.Z) {
                System.out.println("Undo key combination pressed");
                undo();
            }
        });
    }
    private void updateGUI(){
        checkboxSelected.setSelected(state.isSelected());
        rectangle1.setFill(state.getOption(1));
        rectangle2.setFill(state.getOption(2));
        rectangle3.setFill(state.getOption(3));
    }

}
