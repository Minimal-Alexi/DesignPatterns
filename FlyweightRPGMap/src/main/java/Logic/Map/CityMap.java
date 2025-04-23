package Logic.Map;

import Logic.Tiles.AbstractTile;
import Logic.Tiles.BuildingTile;
import Logic.Tiles.ForestTile;
import Logic.Tiles.RoadTile;

import java.util.Random;

public class CityMap extends Map {

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
