package Map;

import Tiles.AbstractTile;

public abstract class Map {
    private final int mapSize = 5;
    public Map(){

    }
    protected abstract AbstractTile createTile();
    public void display(){
        for(int i = 0; i < mapSize; i++){
            for(int j = 0; j < mapSize; j++){
                AbstractTile tile = createTile();
                System.out.print(" " + tile.getDescriptorCharacter() + " ");
            }
            System.out.println();
        }
    }
}
