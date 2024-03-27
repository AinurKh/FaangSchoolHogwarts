package org.hogwarts.spells;

public abstract class Spell {
    private String name;
    private String effect;
    private boolean status;

    public Spell(String name, String effect, boolean status) {
        this.name = name;
        this.effect = effect;
        this.status = status;
    }

    public abstract void doMagic();
}
