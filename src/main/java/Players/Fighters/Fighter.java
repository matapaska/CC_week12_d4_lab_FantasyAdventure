package Players.Fighters;

import Components.Tools.WeaponType;
import Players.Player;



public abstract class Fighter extends Player {

    private WeaponType weapon;

    public Fighter(String name, int healthPoints, int victoryPoints, WeaponType weapon) {
        super(name, healthPoints, victoryPoints);

        this.weapon = weapon;

    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
}
