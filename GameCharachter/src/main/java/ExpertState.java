public class ExpertState extends State {
    public ExpertState(Character character) {
        super(character);
    }

    @Override
    public void action() {
        String[] options = {"Training", "Meditate", "Fight"};
        switch (this.getCharacter().readUserChoice(options)) {
            case 1: {
                this.getCharacter().addExp(25);
                if (this.getCharacter().getExp() >= 1000) {
                    System.out.println("Level up");
                    this.getCharacter().setLevelState(new MasterState(this.getCharacter()));
                }
                break;
            }
            case 2: {
                this.getCharacter().changeHealthPoints(25);
                break;
            }
            case 3: {
                if(this.getCharacter().getHealthPoints() > 50)
                {
                    this.getCharacter().changeHealthPoints(-50);
                    this.getCharacter().addExp(100);
                    if (this.getCharacter().getExp() >= 1000) {
                        System.out.println("Level up");
                        this.getCharacter().setLevelState(new MasterState(this.getCharacter()));
                    }
                }
                else
                {
                    System.out.println("You don't have enough HP!");
                }
                break;
            }
        }
    }
}
