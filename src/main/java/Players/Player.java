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

    public abstract int getPowerPoints();
}
