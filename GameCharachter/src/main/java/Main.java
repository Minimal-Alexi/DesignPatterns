import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your characters name:");
        String name = sc.nextLine();
        Character ch = new Character(name);
        ch.run();
    }
}
