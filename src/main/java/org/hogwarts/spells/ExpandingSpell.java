package org.hogwarts.spells;

public class ExpandingSpell extends Spell{


    public ExpandingSpell(String name, String effect, boolean status) {
        super(name, effect, status);
    }

    @Override
    public void doMagic() {
        System.out.println("Применено увеличение");
    }


}
