package Logic.Map;

import Logic.Tiles.AbstractTile;
import Logic.Tiles.ForestTile;
import Logic.Tiles.SwampTile;
import Logic.Tiles.WaterTile;

import java.util.Random;

public class WildernessMap extends Map {
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
