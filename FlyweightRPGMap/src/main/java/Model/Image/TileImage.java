package Model.Image;

import javafx.scene.image.Image;

public class TileImage implements FlyweightI{
    private final Image image;
    private final String description;
    public TileImage(String imagePath, String description) {
        this.image = new Image(imagePath);
        this.description = description;
    }
    @Override
    public Image getImage() {
        return image;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
