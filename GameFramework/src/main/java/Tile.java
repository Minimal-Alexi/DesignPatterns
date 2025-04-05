import java.util.ArrayList;
import java.util.Random;

public class Tile {
    private Player player;
    private TileType type;
    private ArrayList<Units> units;
    private int incomeSteel,incomeOil,incomeRubber, defenderAdvantage;
    public Tile(TileType type, Player player, int incomeSteel, int incomeOil, int incomeRubber) {
        this.type = type;
        this.player = player;
        this.incomeSteel = incomeSteel;
        this.incomeOil = incomeOil;
        this.incomeRubber = incomeRubber;
        switch (type) {
            case land -> defenderAdvantage = 1;
            case water -> defenderAdvantage = 0;
            case mountain -> defenderAdvantage = 2;
        }
    }
    public void handleBattle(ArrayList<Units> enemyUnits) {
        while(!enemyUnits.isEmpty() && !units.isEmpty()) {
            int defenderStrength = strengthCalculator(units) + defenderAdvantage;
            int attackerStrength = strengthCalculator(enemyUnits);
            Random rand = new Random();
            int defenderScore = rand.nextInt(defenderStrength);
            int attackerScore = rand.nextInt(attackerStrength);
            if(defenderScore > attackerScore) {
                enemyUnits.remove(0);
            }
            else {
                if(attackerScore == defenderScore) {
                    enemyUnits.remove(0);
                    units.remove(0);
                }
                else {
                    units.remove(0);
                }
            }
        }
        if(units.isEmpty()) {
            changeOwnership(enemyUnits.get(0).getPlayer());
        }
    }
    public void changeOwnership(Player player) {
        if(this.player != null) {
            this.player.changeResourceOil(-incomeOil);
            this.player.changeResourceSteel(-incomeSteel);
            this.player.changeResourceRubber(-incomeRubber);
        }
        this.player = player;
        sendResources();
    }
    public void sendResources(){
        this.player.changeResourceSteel(incomeSteel);
        this.player.changeResourceOil(incomeOil);
        this.player.changeResourceRubber(incomeRubber);
    }
    public Player getOwner() {
        return this.player;
    }
    public TileType getType(){
        return this.type;
    }
    private int strengthCalculator(ArrayList<Units> units){
        int strength = 0;
        for(Units unit: units){
            strength += unit.getStrength();
        }
        return strength;
    }
}
