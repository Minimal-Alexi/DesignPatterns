package Model.Image;

import Model.Logic.Tiles.TileEnum;

import java.util.HashMap;
import java.util.Map;

public class TileImageFactory {
    private static final String imageDirectory = "/tile_images/";
    private static final Map<TileEnum,TileImage> images = new HashMap<TileEnum,TileImage>();
    public static TileImage getTileImage(TileEnum tileType) {
        TileImage image = images.get(tileType);
        if (image == null) {
            switch (tileType) {
                case ROAD:{
                    image = new TileImage(imageDirectory + "road_tile.jpg", "road");
                    break;
                }
                case BUILDING:{
                    image = new TileImage(imageDirectory + "building_tile.jpg", "building");
                    break;
                }
                case SWAMP:{
                    image = new TileImage(imageDirectory + "swamp_tile.jpg", "swamp");
                    break;
                }
                case FOREST:{
                    image = new TileImage(imageDirectory + "forest_tile.jpg", "forest");
                    break;
                }
                case WATER:{
                    image = new TileImage(imageDirectory + "water_tile.jpg", "water");
                    break;
                }
                default:{
                    throw new IllegalArgumentException("Unsupported tile type: " + tileType);
                }
            }
            images.put(tileType, image);
        }
        return image;
    }
}
