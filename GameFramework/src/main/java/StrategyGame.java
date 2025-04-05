import java.util.Random;
import java.util.Scanner;

public class StrategyGame extends Game {
    private final Random random = new Random();
    private Player[] players;
    private Tile[][] tiles;
    @Override
    public void initializeGame(int numberOfPlayers) {
        if(numberOfPlayers < 2 || numberOfPlayers > 4) {
            System.out.println("Invalid number of players!");
            return;
        }
        players = new Player[numberOfPlayers];
        for(int i = 0; i < numberOfPlayers; i++) {
            Player player = new Player("P" + i);
            players[i] = player;
        }
        mapInitialization();
    }

    @Override
    public boolean endOfGame() {
        return false;
    }

    @Override
    public void playSingleTurn(int player) {
        displayMap();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    @Override
    public void displayWinner() {

    }
    private void mapInitialization(){
        tiles = new Tile[9][9];
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                tiles[row][col] = new Tile(tileTypeGenerator(),null, random.nextInt(2), random.nextInt(2), random.nextInt(2) );
            }
        }
        for(Player player : players){
            int i = random.nextInt(9), j = random.nextInt(9);
            while(tiles[i][j].getOwner() != null){
                i = random.nextInt(9);
                j = random.nextInt(9);
            }
            tiles[i][j].changeOwnership(player);
        }
    }
    private TileType tileTypeGenerator(){
        int choice = random.nextInt(3);
        switch(choice){
            case 0 -> {
                return TileType.water;
            }
            case 1 -> {
                return TileType.land;
            }
            case 2 -> {
                return TileType.mountain;
            }
        }
        return null;
    }
    private void displayMap(){
        for (int row = 0; row < tiles.length; row++) {
            for (int col = 0; col < tiles[row].length; col++) {
                Tile tile = tiles[row][col];
                String typeChar = switch (tile.getType()) {
                    case land -> "L";
                    case water -> "W";
                    case mountain -> "M";
                };
                String ownerName = tile.getOwner() != null ? tile.getOwner().getName().replace("Player ", "P") : "--";
                System.out.print(typeChar + "(" + ownerName + ") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        StrategyGame strategyGame = new StrategyGame();
        strategyGame.play(4);
    }
}
