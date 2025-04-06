public class Wizard {
    private String name;
    private int hp;
    private boolean shielded;
    public Wizard(String name) {
        this.name = name;
        hp = 10;
        shielded = false;
    }
    public String getName() {
        return name;
    }
    public void heal(){
        hp = Math.min(hp + 2, 10);
    }
    public int getHp(){
        return hp;
    }
    public void activateShield(){
        shielded = true;
    }
    public boolean isShielded(){
        return shielded;
    }
    public void attacked(){
        if(shielded) {
            shielded = false;
        }
        else{
            hp = Math.max(hp - 3, 0);
        }
    }

}
