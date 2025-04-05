public class Player {
    private String name;
    private int resourceSteel,resourceOil,resourceRubber;
    public Player(String name) {
        this.name = name;
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
