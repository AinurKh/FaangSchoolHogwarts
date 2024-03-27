package org.hogwarts;

import java.util.Random;
import java.util.Scanner;

public class Potion {
    public Potion() {
    }

    public boolean prepare() {
        Scanner scanner = new Scanner(System.in);
        String[] ingredients = new String[]{"Драконий коготь", "Лист мандрагоры", "Корень шершавой астрелии"};
        System.out.println("Добро пожаловать в лабораторию зелий!");
        System.out.println("Введите ингредиенты, которые у вас есть (через запятую):");
        String input = scanner.nextLine();
        String[] userIngredients = input.split(",");
        int count = 0;

        for(int i = 0; i < ingredients.length; ++i) {
            if (input.contains(ingredients[i])) {
                ++count;
            }
        }

        if (count == ingredients.length) {
            System.out.println("У вас есть все необходимые ингредиенты для зелья! Можете начинать создание.");
        } else {
            System.out.println("У вас не хватает некоторых ингредиентов. Нельзя приступать к созданию зелья.");
        }

        return false;
    }

}
