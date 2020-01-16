package Players.Spellcasters;

import Components.Tools.CreatureType;
import Components.Tools.SpellType;

public class Wizard extends Spellcaster{
    public Wizard(String name, int healthPoints, int victoryPoints, SpellType spell, CreatureType creature) {
        super(name, healthPoints, victoryPoints, spell, creature);
    }
}
