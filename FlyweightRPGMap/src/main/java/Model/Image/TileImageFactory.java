package Model.Image;

import Model.Logic.Tiles.AbstractTile;

import java.util.HashMap;
import java.util.Map;

public class TileImageFactory {
    private static final Map<AbstractTile,TileImage> images = new HashMap<AbstractTile,TileImage>();
    public static TileImage getTileImage(AbstractTile tile) {
        TileImage image = images.get(tile);
        if (image == null) {
            switch (tile) {
                case SUMMER:
                    image = new TreeImage("birch_summer.png", "Leafy birch tree");
                    break;
                case WINTER:
                    image = new TreeImage("birch_winter.png", "Leafless birch tree");
                    break;
            }
            images.put(type, image);
        }
        return image;
    }
}
