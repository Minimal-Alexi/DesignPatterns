package Model.Logic.Map;

import Model.Logic.Tiles.AbstractTile;
import Model.Logic.Tiles.ForestTile;
import Model.Logic.Tiles.SwampTile;
import Model.Logic.Tiles.WaterTile;

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
                return new SwampTile();
            }
            case 1:
            {
                return new ForestTile();
            }
            case 2:
            {
                return new WaterTile();
            }
        }
        return null;
    }
}
