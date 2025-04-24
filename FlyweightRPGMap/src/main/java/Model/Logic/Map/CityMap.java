package Model.Logic.Map;

import Model.Logic.Tiles.AbstractTile;
import Model.Logic.Tiles.BuildingTile;
import Model.Logic.Tiles.ForestTile;
import Model.Logic.Tiles.RoadTile;

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
                return new RoadTile();
            }
            case 1:
            {
                return new ForestTile();
            }
            case 2:
            {
                return new BuildingTile();
            }
        }
        return null;
    }
}
