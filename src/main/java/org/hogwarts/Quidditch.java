package org.hogwarts;

import java.util.Random;

public class Quidditch {
    public Quidditch() {
    }

    public void getBalls() {
        for(int i = 1; i < 4; ++i) {
            System.out.print("Запущен мяч под названием ");
            switch (i) {
                case 1:
                    System.out.println("Quaffle");
                    break;
                case 2:
                    System.out.println("Bludger");
                    break;
                case 3:
                    System.out.println("Golden Snitch");
            }
        }

    }

    public void playGame() {
        while(true) {
            int control = (new Random()).nextInt(0, 100);
            if (control == 14) {
                System.out.println("Снитч пойман");
                return;
            }

            System.out.println("еще нет");
        }
    }
}
