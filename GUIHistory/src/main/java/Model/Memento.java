package Model;

public class Memento implements IMemento{
    private State state;
    public Memento(State state) {
        this.state = state;
        System.out.println("Memento created");
    }
    public State getState() {
        return state;
    }
}
