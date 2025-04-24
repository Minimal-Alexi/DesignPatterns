package Model.Logic.Tiles;

import Model.Image.TileImage;

public abstract class AbstractTile {
    protected TileImage image;
    protected TileEnum tileType;
    protected char descriptorCharacter;
    protected String description;
    public AbstractTile(TileImage tileImage, TileEnum tileType, char descriptorCharacter, String description) {
        this.image = tileImage;
        this.tileType = tileType;
        this.descriptorCharacter = descriptorCharacter;
        this.description = description;
    }
    public TileImage getImage() {
        return image;
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
