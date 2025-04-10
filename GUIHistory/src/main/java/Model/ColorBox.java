package Model;

import javafx.scene.paint.Color;

public class ColorBox {
    private final Color[] color = {Color.RED, Color.YELLOW, Color.BLUE};
    private int colorIndex;

    public ColorBox() {
        colorIndex = 0;
        System.out.println("ColorBox initialized with default color index = 0 (Color = " + color[colorIndex] + ")");
    }

    public void setColorIndex(int colorIndex) {
        if (colorIndex >= 0 && colorIndex < color.length) {
            System.out.println("Setting ColorBox color index from " + this.colorIndex + " to " + colorIndex +
                    " (Color = " + color[colorIndex] + ")");
            this.colorIndex = colorIndex;
        } else {
            System.out.println("Invalid color index: " + colorIndex);
        }
    }

    public Color getColor() {
        return color[colorIndex];
    }

    public int getColorIndex() {
        return colorIndex;
    }
}
