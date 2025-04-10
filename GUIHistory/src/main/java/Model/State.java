package Model;

public class State {
    private int[] options;
    private boolean isSelected;

    public State() {
        options = new int[3];
        isSelected = false;
    }
    public void setOptionChoice(int option,int choice) {

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
}
