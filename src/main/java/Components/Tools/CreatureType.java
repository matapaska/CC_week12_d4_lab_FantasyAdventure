package Components.Tools;

public enum CreatureType {
    GOLDENDRAGON(40),
    GREYDRAGON(20),
    OGRE(5),
    DEMON(10),
    EUGENE(30);

    private final int powerPoints;

    CreatureType(int powerPoints) {
        this.powerPoints = powerPoints;
    }

    public int getPowerPoints() {
        return powerPoints;
    }
}
