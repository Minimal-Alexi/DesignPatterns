import java.util.ArrayList;

public abstract class Units {
    private ArrayList<TileType> tileType;
    private ArrayList<TileType> weakTileType;
    private int strength, speed;
    public Units(int strength, int speed, ArrayList<TileType> tileType, ArrayList<TileType> weakTileType) {
        this.strength = strength;
        this.speed = speed;
        this.tileType = tileType;
        this.weakTileType = weakTileType;
    }
    public int getStrength() {
        return strength;
    }
}
