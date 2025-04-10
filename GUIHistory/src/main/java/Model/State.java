package Model;

public class State {
    private int[] options;
    private boolean isSelected;

    public State() {
        options = new int[3];
        isSelected = false;
    }
    public void setOptionChoice(int option,int choice) {
        if(option >= 1 && option <= 3) {
            options[option - 1] = choice;
        }
    }
    public int getOption(int option){
        if(option >= 1 && option <= 3) {
            return options[option - 1];
        }
        return -1;
    }
    public boolean isSelected() {
        return isSelected;
    }
    public void setSelected(boolean selected) {
        isSelected = selected;
    }
    public int[] getOptions() {
        return options;
    }
    public IMemento createMemento() {
        return new Memento(this);
    }
    public void restoreState(IMemento memento) {
        Memento selectedMemento = (Memento) memento;
        State selectedState = selectedMemento.getState();
        this.options = selectedState.getOptions();
        this.isSelected = selectedState.isSelected();
    }
}
