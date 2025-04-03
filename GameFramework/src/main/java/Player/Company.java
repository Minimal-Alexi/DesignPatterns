package Player;

import Vehicles.Vehicle;

import java.util.ArrayList;

public class Company {
    private final String name;
    private double cash;
    private ArrayList<Vehicle> vehiclesArrayList;
    public Company(int number) {
        name = "Company " + Integer.toString(number);
        cash = 100000;
        vehiclesArrayList = new ArrayList<Vehicle>();
    }
    public String getName() {
        return name;
    }
    public double getCash() {
        return cash;
    }
}
