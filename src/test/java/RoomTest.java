import Components.EnemyType;
import Components.TreasureType;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public  void before(){
        room = new Room("room1", EnemyType.TROLL, TreasureType.BAGOFDIAMONDS);
    }

    @Test
    public void hasInitialValues(){
        assertEquals("room1", room.getName());
        assertEquals(EnemyType.TROLL, room.getEnemy());
        assertEquals(TreasureType.BAGOFDIAMONDS, room.getTreasure());

    }

}
