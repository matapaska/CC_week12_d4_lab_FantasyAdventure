package Components.Tools;

public enum WeaponType {

    SWORD(10,20),
    AXE(15, 30),
    CLUB(8, 16),
    SPEAR(20, 40),
    MACE(12, 24),
    FISH(3, 6),
    STICK(4, 8),
    BAGUETTE(1, 2),
    PINGPONGRACKET(5, 10);


    private final int damage;
    private final int powerPoints;


    WeaponType(int damage, int powerPoints) {
        this.damage = damage;
        this.powerPoints = powerPoints;
    }

    public int getDamage() {
        return damage;
    }

    public int getPowerPoints() {
        return powerPoints;
    }
}
