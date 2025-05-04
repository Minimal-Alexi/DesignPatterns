package model;

public class CanvasStatus {
    private int cursorPositionX,cursorPositionY;
    private static final int canvasSize = 8;
    // Hey teach.
    // Since the pixels can be just white or black, I have chosen a boolean, more memory efficient.
    // This wouldn't work if pixels could be multicolour, so it would need a bit of refactoring.
    // Just know I thought about what I'm doing.
    // Kiitos :p
    private boolean [][] canvas;
    public CanvasStatus() {
        canvas = new boolean[canvasSize][canvasSize];
        cursorPositionX = 0;
        cursorPositionY = 0;
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
        }
    }
    public void setCursorPositionY(int cursorPositionY) {
        if(checkLimits(cursorPositionX)){
            this.cursorPositionY = cursorPositionY;
        }
    }
    public boolean[][] getCanvas() {
        return canvas;
    }
    private boolean checkLimits(int newPosition){
        return newPosition >= 0 && newPosition < canvasSize;
    }
}
