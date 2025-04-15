import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> redoHistory;
    private List<IMemento> history; // Memento history

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.redoHistory = new ArrayList<>();
        this.history = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Memento found in history");
            IMemento currentState = model.createMemento();
            redoHistory.add(currentState);
            IMemento previousState = history.remove(history.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }
    public void redo() {
        if (!redoHistory.isEmpty()) {
            System.out.println("Memento found in redoHistory");
            IMemento currentState = model.createMemento();
            history.add(currentState);
            IMemento nextState = redoHistory.remove(redoHistory.size() - 1);
            model.restoreState(nextState);
            gui.updateGui();
        }
    }
    public List<IMemento> getHistory() {
        return new ArrayList<>(history);
    }

    public void restoreState(IMemento memento) {
        if (memento != null) {
            saveToHistory();
            model.restoreState(memento);
            gui.updateGui();
        }
    }


    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        redoHistory.clear();
        history.add(currentState);
    }
}