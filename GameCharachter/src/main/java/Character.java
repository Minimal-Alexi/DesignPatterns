import java.util.Scanner;

public class Character {
    private static Scanner scanner = new Scanner(System.in);
    private int exp, healthPoints;
    private String name;
    private State levelState;
    public Character(String name) {
        this.name = name;
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
        System.out.println("\nSelect an option:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ". " + options[i-1]);
        }
        return scanner.nextInt();
    }
}
