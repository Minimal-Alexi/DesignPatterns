package Logic.Tiles;

public abstract class AbstractTile {
    protected char descriptorCharacter;
    protected String description;
    public AbstractTile(char descriptorCharacter, String description) {
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
