package Players.SpellCastersTest;

import Components.Tools.ArmourType;
import Components.Tools.CreatureType;
import Components.Tools.SpellType;
import Components.Tools.WeaponType;
import Players.Spellcasters.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock warlock;

    @Before
    public void before() {
        warlock = new Warlock("Naz", 100, 0, SpellType.BUBBLESORT, CreatureType.EUGENE);
    }

    @Test
    public void hasInheritedParameters() {
        assertEquals("Naz", warlock.getName());
        assertEquals(100, warlock.getHealthPoints());
        assertEquals(0, warlock.getVictoryPoints());
        assertEquals(SpellType.BUBBLESORT, warlock.getSpell());
        assertEquals(CreatureType.EUGENE, warlock.getCreature());
    }
}
