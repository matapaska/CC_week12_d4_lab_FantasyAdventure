package Players.HealersTest;

import Components.Tools.ItemType;
import Players.Healers.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public  void before(){
        cleric = new Cleric("Michael", 100, 0, ItemType.BEER);
    }
    @Test
    public void hasInheritedParameters(){
        assertEquals("Michael", cleric.getName());
        assertEquals(100, cleric.getHealthPoints());
        assertEquals(0, cleric.getVictoryPoints());
        assertEquals(ItemType.BEER, cleric.getItem());

    }
}
