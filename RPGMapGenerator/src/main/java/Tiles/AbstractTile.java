package Tiles;

public abstract class AbstractTile {
    private char descriptorCharacter;
    private String description;

    public char getDescriptorCharacter() {
        return descriptorCharacter;
    }
    public String getDescription() {
        return description;
    }
    public abstract void action();
}
