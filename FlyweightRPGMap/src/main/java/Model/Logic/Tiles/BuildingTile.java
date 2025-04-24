package Model.Logic.Tiles;

import Model.Image.TileImage;

public class BuildingTile extends AbstractTile {
    public BuildingTile(TileImage image) {
        super(image,TileEnum.BUILDING,'B',"building");
    }

    @Override
    public void action() {

    }
}
