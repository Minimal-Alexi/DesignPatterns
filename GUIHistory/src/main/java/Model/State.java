package Model;

import javafx.scene.paint.Color;

public class State {
    private ColorBox[] colorBoxes;
    private boolean isSelected;

    public State() {
        colorBoxes = new ColorBox[3];
        for (int i = 0; i < colorBoxes.length; i++) {
            colorBoxes[i] = new ColorBox();
            System.out.println("Initialized ColorBox at index " + i);
        }
        isSelected = false;
        System.out.println("State initialized with isSelected = false");
    }

    public void setOptionChoice(int option, int choice) {
        if (option >= 1 && option <= 3) {
            System.out.println("Setting color index for option " + option + " to " + choice);
            colorBoxes[option - 1].setColorIndex(choice);
        } else {
            System.out.println("Invalid option index: " + option);
        }
    }

    public Color getOption(int option) {
        if (option >= 1 && option <= 3) {
            Color color = colorBoxes[option - 1].getColor();
            System.out.println("Retrieved color for option " + option + ": " + color);
            return color;
        }
        System.out.println("Invalid option index: " + option);
        return null;
    }

    public boolean isSelected() {
        System.out.println("isSelected queried: " + isSelected);
        return isSelected;
    }

    public void setSelected(boolean selected) {
        this.isSelected = selected;
        System.out.println("isSelected set to: " + selected);
    }

    public ColorBox[] getColorBoxes() {
        System.out.println("getColorBoxes called");
        return colorBoxes;
    }

    public IMemento createMemento() {
        System.out.println("Creating memento");
        return new Memento(this);
    }

    public void restoreState(IMemento memento) {
        System.out.println("Restoring state from memento");
        Memento selectedMemento = (Memento) memento;
        this.colorBoxes = selectedMemento.getColorBoxes();
        this.isSelected = selectedMemento.isSelected();
    }
}
