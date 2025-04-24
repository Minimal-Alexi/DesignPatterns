package Model.Image;

import Model.Logic.Tiles.AbstractTile;
import Model.Logic.Tiles.TileEnum;
import Model.Logic.Tiles.WaterTile;

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
                    image = new TileImage(image + "road_tile", "road");
                    break;
                }
                case BUILDING:{
                    image = new TileImage(image + "building_tile", "building");
                    break;
                }
                case SWAMP:{
                    image = new TileImage(image + "swamp_tile", "swamp");
                    break;
                }
                case FOREST:{
                    image = new TileImage(image + "forest_tile", "forest");
                    break;
                }
                case WATER:{
                    image = new TileImage(image + "water_tile", "water");
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
