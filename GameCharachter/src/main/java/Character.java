import java.util.Scanner;

public class Character {
    private static Scanner scanner = new Scanner(System.in);
    private int exp, healthPoints;
    private final String name;
    private State levelState;
    public Character(String name) {
        this.name = name;
        levelState = new NoviceState(this);
    }
    public void addExp(int exp) {
        this.exp += exp;
    }
    public void changeHealthPoints(int healthPoints) {
        this.healthPoints += healthPoints;
    }
    public int getHealthPoints() {
        return healthPoints;
    }
    public int getExp() {
        return exp;
    }
    public String getName() {
        return name;
    }
    public State getLevelState() {
        return levelState;
    }
    public int readUserChoice(String[] options) {
        System.out.println("\nYou are: " + getName());
        System.out.println("You currently have: " + getExp() + " exp");
        System.out.println("You currently have: " + getHealthPoints() + " health points");
        System.out.println("Select an option:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ". " + options[i-1]);
        }
        return scanner.nextInt();
    }
    public void setLevelState(State levelState) {
        resetExp();
        this.levelState = levelState;
    }
    public void run(){
        if(levelState instanceof MasterState)
        {
            return;
        }
        levelState.action();
    }
    private void resetExp(){
        exp = 0;
    }
}
