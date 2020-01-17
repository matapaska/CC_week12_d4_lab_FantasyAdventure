package Components;

public enum EnemyType {

    ORC(-20, 40),
    TROLL(-10, 20);

    private final int damage;
    private final int powerPoints;

    EnemyType(int damage, int powerPoints) {
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
