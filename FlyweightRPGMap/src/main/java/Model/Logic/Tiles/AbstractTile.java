package Model.Logic.Tiles;

public abstract class AbstractTile {
    protected TileEnum tileType;
    protected char descriptorCharacter;
    protected String description;
    public AbstractTile(TileEnum tileType, char descriptorCharacter, String description) {
        this.tileType = tileType;
        this.descriptorCharacter = descriptorCharacter;
        this.description = description;
    }

    public char getDescriptorCharacter() {
        return descriptorCharacter;
    }
    public TileEnum getTileType() {
        return tileType;
    }
    public String getDescription() {
        return description;
    }
    public abstract void action();
}
