package Vehicles;

public abstract class Vehicle {
    protected int speed,xPos, yPos, reliability;
    protected float runningCost,reliabilityInfluence;
    public Vehicle(int speed, int xPos, int yPos, float runningCost, float reliabilityInfluence) {
        this.speed = speed;
        this.xPos = xPos;
        this.yPos = yPos;
        reliability = 100;
        this.runningCost = runningCost;
        this.reliabilityInfluence = reliabilityInfluence;
    }
}
