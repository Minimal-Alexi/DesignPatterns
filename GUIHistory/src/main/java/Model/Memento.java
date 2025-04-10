package Model;

public class Memento implements IMemento{
    private ColorBox[] colorBoxes;
    private boolean isSelected;
    public Memento(State state) {
        this.colorBoxes = state.getColorBoxes().clone();
        this.isSelected = state.isSelected();
        System.out.println("Memento created");
    }
    public ColorBox[] getColorBoxes() {
        return colorBoxes;
    }
    public boolean isSelected() {
        return isSelected;
    }
}
