package Tiles;

public abstract class AbstractTile {
    protected char descriptorCharacter;
    protected String description;

    public char getDescriptorCharacter() {
        return descriptorCharacter;
    }
    public String getDescription() {
        return description;
    }
    public abstract void action();
}
