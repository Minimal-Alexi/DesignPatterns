import Map.*;

import java.util.Scanner;

public class Game {
    private static Map gameMap;
    private static void createMap(int mapOption)
    {
        if(mapOption == 1)
        {
            gameMap = new CityMap();
        }
        else
        {
            gameMap = new WildernessMap();
        }
        gameMap.display();
    }
    public static void main(String[] args) {
        boolean run = true;
        while (run)
        {
            System.out.println("Welcome to the Map Game");
            System.out.println("Please select a map option");
            System.out.println("1. Create a City map");
            System.out.println("2. Create a Wilderness map");
            System.out.println("3. Exit");
            Scanner scanner = new Scanner(System.in);
            int mapOption = scanner.nextInt();
            switch(mapOption)
            {
                case 1, 2:
                {
                    createMap(mapOption);
                    break;
                }
                case 3:
                {
                    run = false;
                    break;
                }
            }
        }
    }
}
