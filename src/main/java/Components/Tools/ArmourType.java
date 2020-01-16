package Components.Tools;

public enum ArmourType {

    HELMET(5),
    SHIELD(10),
    CUIRASS(15);

    private final int armour;

    ArmourType(int armour) {
        this.armour = armour;
    }

    public int getArmour() {
        return armour;
    }
}
