public class IntermediateState extends State {
    public IntermediateState(Character character){
        super(character);
    }

    @Override
    public void action() {
        String[] options = {"Training","Meditate"};
        switch (this.getCharacter().readUserChoice(options)) {
            case 1:
            {
                this.getCharacter().addExp(25);
                if(this.getCharacter().getExp() >= 200)
                {
                    System.out.println("Level up");
                    this.getCharacter().setLevelState(new ExpertState(this.getCharacter()));
                }
                break;
            }
            case 2:
            {
                this.getCharacter().changeHealthPoints(25);
                break;
            }
        }
    }
}
