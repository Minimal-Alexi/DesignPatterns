package Model;

import javafx.scene.paint.Color;

public class ColorBox {
    private final Color[] color = {Color.RED,Color.YELLOW,Color.BLUE};
    private int colorIndex;
    public ColorBox() {
        colorIndex = 0;
    }
    public void setColorIndex(int colorIndex) {
        this.colorIndex = colorIndex;
    }
    public Color getColor() {
        return color[colorIndex];
    }
    public int getColorIndex() {
        return colorIndex;
    }
}
