package Model.Logic.Map;

import Model.Logic.Tiles.*;

import java.util.Random;

public class CityMap extends Map {

    public CityMap(int mapSize) {
        super(mapSize);
    }

    @Override
    protected AbstractTile createTile(){
        Random rand = new Random();
        switch(rand.nextInt(3))
        {
            case 0:
            {
                return new RoadTile(getImageFromFactory(TileEnum.ROAD));
            }
            case 1:
            {
                return new ForestTile(getImageFromFactory(TileEnum.FOREST));
            }
            case 2:
            {
                return new BuildingTile(getImageFromFactory(TileEnum.BUILDING));
            }
        }
        return null;
    }
}
