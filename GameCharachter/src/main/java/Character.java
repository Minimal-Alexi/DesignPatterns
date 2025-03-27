import java.util.Scanner;

public class Character {
    private static Scanner scanner = new Scanner(System.in);
    private int level, exp, healthPoints;
    private String name;
    private State levelState;
    public Character(String name) {
        this.name = name;
    }
    public int readUserChoice(String[] options) {
        System.out.println("\nSelect an option:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ". " + options[i-1]);
        }
        return scanner.nextInt();
    }
}
