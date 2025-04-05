import java.util.ArrayList;

public abstract class Units {
    private Player player;
    private ArrayList<TileType> tileType;
    private ArrayList<TileType> weakTileType;
    private int strength, speed, priceSteel,priceRubber,priceOil;
    public Units(int strength, int speed,int priceSteel, int priceOil, int priceRubber, ArrayList<TileType> tileType, ArrayList<TileType> weakTileType, Player player) {
        this.strength = strength;
        this.speed = speed;
        this.tileType = tileType;
        this.weakTileType = weakTileType;
        this.priceSteel = priceSteel;
        this.priceRubber = priceRubber;
        this.priceOil = priceOil;
        this.player = player;
    }
    public int getStrength() {
        return strength;
    }
    public Player getPlayer() {
        return player;
    }
}
