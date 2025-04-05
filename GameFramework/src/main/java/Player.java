import java.util.ArrayList;

public class Player {
    private String name;
    private int resourceSteel,resourceOil,resourceRubber;
    private ArrayList<Units> units;
    public Player(String name) {
        this.name = name;
        this.resourceSteel = 0;
        this.resourceOil = 0;
        this.resourceRubber = 0;
        this.units = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public int getResourceSteel() {
        return resourceSteel;
    }
    public int getResourceOil() {
        return resourceOil;
    }
    public int getResourceRubber() {
        return resourceRubber;
    }
    public void changeResourceSteel(int newSteel) {
        resourceSteel += newSteel;
    }
    public void changeResourceOil(int newOil) {
        resourceOil += newOil;
    }
    public void changeResourceRubber(int newRubber) {
        resourceRubber += newRubber;
    }
}
