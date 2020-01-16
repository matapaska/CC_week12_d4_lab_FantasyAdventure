package Components.Tools;

public enum SpellType {

    SANDYSTORM(50, 100),
    SKYFALL(15, 30),
    JOHNFERNO(20, 40),
    COLINITQUITS(10, 20),
    HARRISONHAND(30, 60),
    EUGENEABANDONUS(40, 80),
    NOTDEFINED(25, 50),
    POLYMORPH(16, 32),
    BUBBLESORT(35, 70);


    private final int damage;
    private final int powerPoints;

    SpellType(int damage, int powerPoints) {
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
