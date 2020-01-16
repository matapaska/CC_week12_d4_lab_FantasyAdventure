package Rooms;

import Components.EnemyType;
import Components.TreasureType;

public class Room {

    private String name;
    private EnemyType enemy;
    private TreasureType treasure;

    public Room(String name, EnemyType enemy, TreasureType treasure) {
        this.name = name;
        this.enemy = enemy;
        this.treasure = treasure;
    }

    public String getName() {
        return name;
    }

    public EnemyType getEnemy() {
        return enemy;
    }

    public void setEnemy(EnemyType enemy) {
        this.enemy = enemy;
    }

    public TreasureType getTreasure() {
        return treasure;
    }

    public void setTreasure(TreasureType treasure) {
        this.treasure = treasure;
    }
}
