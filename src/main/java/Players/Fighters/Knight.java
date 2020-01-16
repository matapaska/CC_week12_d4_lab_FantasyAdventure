package Players.Fighters;

import Components.Tools.ArmourType;
import Components.Tools.WeaponType;

public class Knight extends Fighter {

    public Knight(String name, int healthPoints, int victoryPoints, WeaponType weapon, ArmourType armour) {
        super(name, healthPoints, victoryPoints, weapon, armour);
    }
}
