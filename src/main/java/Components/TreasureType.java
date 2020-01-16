package Components;

public enum TreasureType {

    SANDYSMARKER(50),
    JUANSGLASSES(40),
    BAGOFDIAMONDS(30),
    INVISIBILILYCLOAK(20),
    PINKPANTHER(15),
    TREASURECHEST(5);

    private final int victoryPoints;

    TreasureType(int victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }


}
