import java.util.ArrayList;

public class Computer {
    private ArrayList<Component> components;
    public Computer() {
        components = new ArrayList<>();
    }
    public void addComponent(Component component) {
        components.add(component);
    }
    public String toString(){
        StringBuilder output = new StringBuilder();
        for (Component component : components) {
            output.append(component.toString()).append("\n");
        }
        return output.toString();
    }
}
