package Players;

public abstract class Player {

    private String name;
    private int healthPoints;
    private int victoryPoints;

    public Player(String name, int healthPoints, int victoryPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.victoryPoints = victoryPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setVictoryPoints(int victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    public int calculateVictoryPoints(int value) {
        return victoryPoints += value;
    }

    public int calculateHealthPoints(int value){
        return healthPoints += value;
    }

    public abstract int getPowerPoints();
}
