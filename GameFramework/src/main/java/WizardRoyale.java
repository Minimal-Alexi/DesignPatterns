import java.util.ArrayList;
import java.util.Scanner;

public class WizardRoyale extends Game{
    ArrayList<Wizard> wizardsList;
    @Override
    public void initializeGame(int numberOfPlayers) {
        wizardsList = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            wizardsList.add(new Wizard("Wizard " + i));
        }
    }

    @Override
    public boolean endOfGame() {
        return false;
    }

    @Override
    public void playSingleTurn(int player) {
        System.out.println("You are " + wizardsList.get(player).getName() + ", you currently have " + wizardsList.get(player).getHp() + " health.");
        System.out.println("Shield status: " + wizardsList.get(player).isShielded());
        System.out.println("Please select a number: \n" +
                "1. Shield\n" +
                "2. Heal\n" +
                "3. Cast fireball");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case 1: {
                wizardsList.get(player).activateShield();
                break;
            }
            case 2: {
                wizardsList.get(player).heal();
                break;
            }
            case 3: {
                System.out.println("Attack one of the following wizards");
                int attackOption = 0;
                for(Wizard wizard : wizardsList) {
                    if(wizard != wizardsList.get(player)) {
                        System.out.println(attackOption+". "+ wizard.getName() + " (" + wizard.getHp() +")" +" Shielded: " + wizard.isShielded());
                    }
                    else {
                        System.out.println(attackOption+". This is you." + " (" + wizard.getHp() +")" + " Shielded: " + wizard.isShielded());
                    }
                    attackOption += 1;
                }
                attackOption = scanner.nextInt();
                Wizard attackedWizard = wizardsList.get(attackOption);
                attackedWizard.attacked();
                break;
            }
        }
    }

    @Override
    public void displayWinner() {

    }
    public static void main(String[] args) {
        Game game = new WizardRoyale();
        game.play(4);
    }
}
