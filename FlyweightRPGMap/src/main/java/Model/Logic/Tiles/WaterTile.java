package Model.Logic.Tiles;

import Model.Image.TileImage;

public class WaterTile extends AbstractTile{
    public WaterTile(TileImage image) {
        super(image,TileEnum.WATER,'W',"water");
    }

    @Override
    public void action() {

    }
}
