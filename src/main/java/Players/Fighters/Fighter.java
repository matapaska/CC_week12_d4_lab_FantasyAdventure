package Players.Fighters;

import Components.Tools.ArmourType;
import Components.Tools.WeaponType;
import Players.Player;



public abstract class Fighter extends Player {

    private WeaponType weapon;
    private ArmourType armour;

    public Fighter(String name, int healthPoints, int victoryPoints, WeaponType weapon, ArmourType armour) {
        super(name, healthPoints, victoryPoints);

        this.weapon = weapon;
        this.armour = armour;

    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public ArmourType getArmour() {
        return armour;
    }

    public void setArmour(ArmourType armour) {
        this.armour = armour;
    }
}
