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
        Color currentColor = color[colorIndex];
        System.out.println("Retrieving color at index " + colorIndex + ": " + currentColor);
        return currentColor;
    }

    public int getColorIndex() {
        System.out.println("Retrieving current color index: " + colorIndex);
        return colorIndex;
    }
}
