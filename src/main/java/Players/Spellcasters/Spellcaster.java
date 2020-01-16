package Players.Spellcasters;

import Components.Tools.CreatureType;
import Components.Tools.SpellType;
import Players.Player;

public abstract class Spellcaster extends Player {

    private SpellType spell;
    private CreatureType creature;

    public Spellcaster(String name, int healthPoints, int victoryPoints, SpellType spell, CreatureType creature) {
        super(name, healthPoints, victoryPoints);
        this.spell = spell;
        this.creature = creature;
    }

    public SpellType getSpell() {
        return spell;
    }

    public void setSpell(SpellType spell) {
        this.spell = spell;
    }

    public CreatureType getCreature() {
        return creature;
    }

    public void setCreature(CreatureType creature) {
        this.creature = creature;
    }
}
