package model;

import controller.PixelArtController;

public class CanvasStatus {
    private int cursorPositionX,cursorPositionY;
    private static final int canvasSize = 8;
    // Hey teach.
    // Since the pixels can be just white or black, I have chosen a boolean, more memory efficient.
    // This wouldn't work if pixels could be multicolour, so it would need a bit of refactoring.
    // Just know I thought about what I'm doing.
    // Kiitos :p
    private boolean [][] canvas;
    // Listener architecture.
    private PixelArtController controller;
    public CanvasStatus(PixelArtController controller) {
        canvas = new boolean[canvasSize][canvasSize];
        this.controller = controller;
        cursorPositionX = 0;
        cursorPositionY = 0;
        controller.refreshCanvas(canvas,cursorPositionX,cursorPositionY);
    }
    public int getCursorPositionX() {
        return cursorPositionX;
    }
    public int getCursorPositionY() {
        return cursorPositionY;
    }
    public void setCursorPositionX(int cursorPositionX) {
        if(checkLimits(cursorPositionX)){
            this.cursorPositionX = cursorPositionX;
            controller.refreshCanvas(canvas,cursorPositionX,cursorPositionY);
        }
    }
    public void setCursorPositionY(int cursorPositionY) {
        if(checkLimits(cursorPositionX)){
            this.cursorPositionY = cursorPositionY;
            controller.refreshCanvas(canvas,cursorPositionX,cursorPositionY);
        }
    }
    public boolean[][] getCanvas() {
        return canvas;
    }
    public String getCanvasCode() {
        StringBuilder builder = new StringBuilder();
        builder.append("private boolean[][] canvas = {\n");
        for (int i = 0; i < canvasSize; i++) {
            builder.append("    {");
            for (int j = 0; j < canvasSize; j++) {
                builder.append(canvas[i][j] ? "1" : "0");
                if (j < canvasSize - 1) {
                    builder.append(", ");
                }
            }
            builder.append("}");
            if (i < canvasSize - 1) {
                builder.append(",");
            }
            builder.append("\n");
        }
        builder.append("};");
        return builder.toString();
    }
    public void toggleCurrentPixel(){
        canvas[cursorPositionX][cursorPositionY] = !canvas[cursorPositionX][cursorPositionY];
        controller.refreshCanvas(canvas,cursorPositionX,cursorPositionY);
    }
    private boolean checkLimits(int newPosition){
        return newPosition >= 0 && newPosition < canvasSize;
    }
}
