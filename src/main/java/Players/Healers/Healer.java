package Players.Healers;

import Components.Tools.ItemType;
import Players.Player;

public abstract class Healer extends Player {

    private ItemType item;

    public Healer(String name, int healthPoints, int victoryPoints, ItemType item) {
        super(name, healthPoints, victoryPoints);
        this.item = item;
    }

    public ItemType getItem() {
        return item;
    }

    public void setItem(ItemType item) {
        this.item = item;
    }

    public int getPowerPoints(){
        return item.getPowerPoints();
    }

}
