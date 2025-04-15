import java.sql.Timestamp;

public class Memento implements IMemento {
    private int[] options;
    private boolean isSelected;
    private Timestamp timestamp;

    public Memento(int[] options, boolean isSelected) {
        this.options = options.clone(); // Copy options array
        this.isSelected = isSelected;
        this.timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Memento created");
    }

    public int[] getOptions() {
        return options;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}