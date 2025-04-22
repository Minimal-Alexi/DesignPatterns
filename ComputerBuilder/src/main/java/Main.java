import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        mainLoop();
    }
    public static void mainLoop(){
        int choice = computerChoice();
        int qualityChoice = qualityChoice();
        ComputerBuilderI computerBuilder;
        switch (choice) {
            case 1: {
                computerBuilder = new GamingComputerBuilder();
                break;
            }
            case 2: {
                computerBuilder = new OfficeComputerBuilder();
                break;
            }
            default: {
                System.out.println("Invalid choice");
                computerBuilder = new OfficeComputerBuilder();
            }
        }
        ComputerDirector computerDirector = new ComputerDirector(computerBuilder);
        switch (qualityChoice) {
            case 1: {
                computerDirector.buildBadComputer();
                break;
            }
            case 2: {
                computerDirector.buildAverageComputer();
                break;
            }
            case 3:{
                computerDirector.buildGoodComputer();
                break;
            }
        }
        System.out.println(computerDirector.getComputer());
        int quitChoice = quitChoice();
        if (quitChoice == 2) {
            System.out.println("Goodbye");
        }
        else {
            mainLoop();
        }
    }
    public static int computerChoice(){
        System.out.println("What kind of computer would you like to buy?");
        System.out.println("1. Gaming computer");
        System.out.println("2. Office computer");
        int computerOption = scanner.nextInt();
        if(computerOption >= 1 && computerOption <= 2){
            return computerOption;
        }
        System.out.println("Please enter a number between 1 and 2");
        return computerChoice();
    }
    public static int qualityChoice(){
        System.out.println("What kind of computer would you like to buy?");
        System.out.println("1. Low quality computer");
        System.out.println("2. Medium quality computer");
        System.out.println("3. High quality computer");
        int computerOption = scanner.nextInt();
        if(computerOption >= 1 && computerOption <= 3){
            return computerOption;
        }
        System.out.println("Please enter a number between 1 and 3");
        return qualityChoice();
    }
    public static int quitChoice(){
        System.out.println("Would you like to retry?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int quitOption = scanner.nextInt();
        if(quitOption >= 1 && quitOption <= 2){
            return quitOption;
        }
        System.out.println("Please enter a number between 1 and 2");
        return quitChoice();
    }
}
