package Model;

import javafx.scene.paint.Color;

public class State {
    private ColorBox[] colorBoxes;
    private boolean isSelected;

    public State() {
        colorBoxes = new ColorBox[3];
        for (int i = 0; i < colorBoxes.length; i++) {
            colorBoxes[i] = new ColorBox();
        }
        isSelected = false;
    }
    public void setOptionChoice(int option,int choice) {
        if(option >= 1 && option <= 3) {
            colorBoxes[option - 1].setColorIndex(choice);
        }
    }
    public Color getOption(int option){
        if(option >= 1 && option <= 3) {
            return colorBoxes[option - 1].getColor();
        }
        return null;
    }
    public boolean isSelected() {
        return isSelected;
    }
    public void setSelected(boolean selected) {
        isSelected = selected;
    }
    public ColorBox[] getColorBoxes() {
        return colorBoxes;
    }
    public IMemento createMemento() {
        return new Memento(this);
    }
    public void restoreState(IMemento memento) {
        Memento selectedMemento = (Memento) memento;
        State selectedState = selectedMemento.getState();
        this.colorBoxes = selectedState.getColorBoxes();
        this.isSelected = selectedState.isSelected();
    }
}
