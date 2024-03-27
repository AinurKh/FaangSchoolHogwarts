package org.hogwarts;

import java.util.Scanner;

public class SoringHat {
    public SoringHat() {
    }

    public String sort() {
        String question1 = "Ты предпочитаешь работать в команде?";
        String question2 = "Ты любишь разгадывать головоломки?";
        String question3 = "Ты идешь на риск, чтобы достичь своей цели?";
        String question4 = "Ты проявляешь заботу к существам и природе?";

        String yes = "Да";
        String no = "Нет";

        System.out.println(question1);
        String answer1 = (new Scanner(System.in)).nextLine();

        System.out.println(question2);
        String answer2 = (new Scanner(System.in)).nextLine();

        System.out.println(question3);
        String answer3 = (new Scanner(System.in)).nextLine();

        System.out.println(question4);
        String answer4 = (new Scanner(System.in)).nextLine();

        if (answer1.equals(yes)){
            if (answer3.equals(yes)){
                return "Гриффиндор";
            }
        }else if (answer4.equals(yes)) {
            return "Пуффендуй";
        } else if (answer2.equals(yes)) {
            if (answer1.equals(yes)){
                return "Когтевран";
            } else if (answer3.equals(yes)) {
                return "Когтевран";
            } else return "Слизерин";
        } else if (answer3.equals(yes)) {
            return "Слизерин";
        } else return  "Пуффендуй";

        return null;
    }
}
