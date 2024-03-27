package org.hogwarts.spells;

public class ReducingSpell extends Spell{
    public ReducingSpell(String name, String effect, boolean status) {
        super(name, effect, status);
    }

    @Override
    public void doMagic() {
        System.out.println(" применено заклинание уменьшения");
    }
}
