package Map;

import Tiles.AbstractTile;

public abstract class Map {
    private final int mapSize = 5;
    private AbstractTile[][] tiles = new AbstractTile[mapSize][mapSize];
    public abstract AbstractTile createTile();
    public void display(){
        for(int i = 0; i < mapSize; i++){
            for(int j = 0; j < mapSize; j++){
                System.out.print(" " + tiles[i][j].getDescriptorCharacter() + " ");
            }
            System.out.println();
        }
    }
}
