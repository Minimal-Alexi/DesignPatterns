package Model.Image;

import Model.Logic.Tiles.AbstractTile;
import Model.Logic.Tiles.TileEnum;

import java.util.HashMap;
import java.util.Map;

public class TileImageFactory {
    private static final Map<TileEnum,TileImage> images = new HashMap<TileEnum,TileImage>();
    public static TileImage getTileImage(AbstractTile tile) {
        TileEnum tileType = tile.getTileType();
        TileImage image = images.get(tileType);
        if (image == null) {
            switch (tileType) {
                case ROAD:{

                }
                case BUILDING:{

                }
                case SWAMP:{

                }
                case FOREST:{

                }
                case WATER:{

                }
                default:{
                    throw new IllegalArgumentException("Unsupported tile type: " + tileType);
                }
            }
        }
        return image;
    }
}
