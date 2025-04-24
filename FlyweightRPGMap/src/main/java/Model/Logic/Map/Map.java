package Model.Logic.Map;

import Model.Image.TileImage;
import Model.Image.TileImageFactory;
import Model.Logic.Tiles.AbstractTile;
import Model.Logic.Tiles.TileEnum;

public abstract class Map {
    private final int mapSize;
    private final AbstractTile[][] map;
    public Map(int mapSize) {
        this.mapSize = mapSize;
        map = new AbstractTile[mapSize][mapSize];
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                map[i][j] = createTile();
            }
        }
    }
    protected abstract AbstractTile createTile();
    protected TileImage getImageFromFactory(TileEnum tileType) {
        return TileImageFactory.getTileImage(tileType);
    }
    public void display(){
        for(int i = 0; i < mapSize; i++){
            for(int j = 0; j < mapSize; j++){
                System.out.print(" " + map[i][j].getDescriptorCharacter() + " ");
            }
            System.out.println();
        }
    }
    public AbstractTile[][] getMap(){
        return map;
    }
}
