package Controller;

import Model.IMemento;
import Model.State;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class ColorController {
    private State state;
    private ArrayList<IMemento> stateHistory;
    @FXML
    private Rectangle rectangle1, rectangle2, rectangle3;
    @FXML
    private CheckBox checkboxSelected;
    public void initialize() {
        state = new State();
        stateHistory = new ArrayList<>();
        rectangleInitialization(rectangle1,1);
        rectangleInitialization(rectangle2,2);
        rectangleInitialization(rectangle3,3);
    }

    private void rectangleInitialization(Rectangle rectangle, int rectangleOption) {
        rectangle.setOnMouseClicked(event -> {
            int currentIndex = state.getColorBoxes()[rectangleOption - 1].getColorIndex();

            int nextIndex = (currentIndex + 1) % 3;

            state.setOptionChoice(rectangleOption, nextIndex);
            rectangle.setFill(state.getOption(rectangleOption));
        });
    }

}
