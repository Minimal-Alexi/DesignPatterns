package Model.Logic.Map;

import Model.Logic.Tiles.*;

import java.util.Random;

public class WildernessMap extends Map {
    public WildernessMap(int mapSize) {
        super(mapSize);
    }

    @Override
    protected AbstractTile createTile(){
        Random rand = new Random();
        switch(rand.nextInt(3))
        {
            case 0:
            {
                return new SwampTile(getImageFromFactory(TileEnum.SWAMP));
            }
            case 1:
            {
                return new ForestTile(getImageFromFactory(TileEnum.FOREST));
            }
            case 2:
            {
                return new WaterTile(getImageFromFactory(TileEnum.WATER));
            }
        }
        return null;
    }
}
