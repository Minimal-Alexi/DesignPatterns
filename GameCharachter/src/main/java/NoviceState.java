public class NoviceState extends State {
    public NoviceState(Character character){
        super(character);
    }

    @Override
    public void action() {
        String[] options = {"Training"};
        switch (this.getCharacter().readUserChoice(options)) {
            case 1:
            {
                this.getCharacter().addExp(25);
                if(this.getCharacter().getExp() == 100)
                {
                    this.getCharacter().setLevelState();
                }
            }
        }
    }
}
