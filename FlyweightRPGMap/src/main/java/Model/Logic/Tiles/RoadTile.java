package Model.Logic.Tiles;

import Model.Image.TileImage;

public class RoadTile extends AbstractTile {
    public RoadTile(TileImage image) {
        super(image,TileEnum.ROAD,'R',"roads");
    }

    @Override
    public void action() {

    }
}
