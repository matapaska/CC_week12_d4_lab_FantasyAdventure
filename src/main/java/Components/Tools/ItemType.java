package Components.Tools;

public enum ItemType {

    HEALINGPOTION(10),
    BEER(5),
    WHOLECHICKEN(7),
    BIGMAC(8),
    VEGANBURGER(9);

    private final int healPoints;

    ItemType(int healPoints) {
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }
}
