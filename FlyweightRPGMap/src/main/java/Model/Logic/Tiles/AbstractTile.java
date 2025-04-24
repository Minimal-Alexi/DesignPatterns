package Model.Logic.Tiles;

public abstract class AbstractTile {
    protected TileEnum tile;
    protected char descriptorCharacter;
    protected String description;
    public AbstractTile(TileEnum tile,char descriptorCharacter, String description) {
        this.tile = tile;
        this.descriptorCharacter = descriptorCharacter;
        this.description = description;
    }

    public char getDescriptorCharacter() {
        return descriptorCharacter;
    }
    public String getDescription() {
        return description;
    }
    public abstract void action();
}
