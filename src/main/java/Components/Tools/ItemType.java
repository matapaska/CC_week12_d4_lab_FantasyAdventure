package Components.Tools;

public enum ItemType {

    HEALINGPOTION(10, 0),
    BEER(5, 0),
    WHOLECHICKEN(7, 0),
    BIGMAC(8, 0),
    VEGANBURGER(9, 0);

    private final int healPoints;
    private final int powerPoints;

    ItemType(int healPoints, int powerPoints) {
        this.healPoints = healPoints;
        this.powerPoints = powerPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }
    public int getPowerPoints() {
        return powerPoints;
    }
}
