package org.hogwarts.items;

public class Cloak implements Invisible{
    private int capacity;
    private int weight;

    @Override
    public void becomeInvisible() {
        System.out.println("Человек вплаще невидим");
    }

    @Override
    public void becomeVisible() {
        System.out.println("Человек вплаще стал видим");
    }
}
