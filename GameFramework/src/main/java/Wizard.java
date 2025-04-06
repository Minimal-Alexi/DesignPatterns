public class Wizard {
    int hp;
    boolean shielded;
    public Wizard(){
        hp = 10;
        shielded = false;
    }
    public void heal(){
        hp = Math.min(hp, 10);
    }
    public int getHp(){
        return hp;
    }
    public boolean isShielded(){
        return shielded;
    }

}
