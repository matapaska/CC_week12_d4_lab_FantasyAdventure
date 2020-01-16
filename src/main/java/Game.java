import Components.EnemyType;
import Players.Player;
import Rooms.Room;

public class Game {
    private Player player;
    private Room room;

    public Game(Player player, Room room) {
        this.player = player;
        this.room = room;
    }

    public Player getPlayer() {
        return player;
    }

    public Room getRoom() {
        return room;
    }

    public boolean comparePowerPoints(Room room, Player player) {
        if (player.getPowerPoints() < room.getEnemy().getPowerPoints()){
            return true;
        } else{
            return false;
        }
    }
}
