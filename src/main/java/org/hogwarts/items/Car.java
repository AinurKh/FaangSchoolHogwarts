package org.hogwarts.items;

import org.hogwarts.Student;

public class Car implements Invisible {
    private Student driver;
    private int speed;
    private boolean isFlying;

    @Override
    public void becomeInvisible() {
        System.out.println("Машина стала невидимой");
    }

    @Override
    public void becomeVisible() {
        System.out.println("Машина стала видимой");
    }

    public Car(Student driver, int speed, boolean isFlying) {
        this.driver = driver;
        this.speed = speed;
        this.isFlying = isFlying;
        if (this.isFlying){
            becomeInvisible();
        }else becomeVisible();
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
        if (this.isFlying){
            becomeInvisible();
        }else becomeVisible();
    }
}
