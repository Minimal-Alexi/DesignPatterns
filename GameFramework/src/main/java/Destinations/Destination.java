package Destinations;

import Systems.Cargo;

import java.util.ArrayList;

public abstract class Destination {
    boolean port,airport;
    protected int xPos,yPos,productionRate;
    protected String name;
    protected Cargo producedCargo;
    protected ArrayList<Cargo> acceptedCargo;
    public Destination(boolean port, boolean airport, int xPos, int yPos, int productionRate, String name, Cargo producedCargo, ArrayList<Cargo> acceptedCargo) {
        this.port = port;
        this.airport = airport;
        this.xPos = xPos;
        this.yPos = yPos;
        this.productionRate = productionRate;
        this.name = name;
        this.producedCargo = producedCargo;
        this.acceptedCargo = acceptedCargo;
    }
    public String getName(){
        return name;
    }
    public int getXPos(){
        return xPos;
    }
    public int getYPos(){
        return yPos;
    }
}
