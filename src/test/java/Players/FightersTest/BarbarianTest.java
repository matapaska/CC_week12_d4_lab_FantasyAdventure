package Players.FightersTest;

import Components.Tools.ArmourType;
import Components.Tools.WeaponType;
import Players.Fighters.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    WeaponType weapon;


    @Before
    public void before(){
        barbarian = new Barbarian("Juan", 100, 0, WeaponType.AXE, ArmourType.CUIRASS);
    }

    @Test
    public void hasInheritedParameters(){
        assertEquals("Juan", barbarian.getName());
        assertEquals(100, barbarian.getHealthPoints());
        assertEquals(0, barbarian.getVictoryPoints());
        assertEquals(WeaponType.AXE, barbarian.getWeapon());
        assertEquals(ArmourType.CUIRASS, barbarian.getArmour());



    }

    @Test
    public void canGetPowerpoints() {
        assertEquals(30, barbarian.getPowerPoints());
    }
}
