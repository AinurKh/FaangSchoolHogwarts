package org.hogwarts;

public class Spell {
    private String title;
    private int power;

    public Spell(String title, int power) {
        this.title = title;
        if (power<0 || power>7){
            throw new IllegalArgumentException("Уровень от 1 до 7 максимум");
        }
        this.power = power;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power<0 || power>9){
            throw new SpellCastException("Уровень от 1 до 7 максимум");
        }
        this.power = power;
    }

}
