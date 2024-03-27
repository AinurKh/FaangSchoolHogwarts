package org.hogwarts.beast;

import org.hogwarts.Student;

import java.util.Random;

public class Hippogriff {
    private String name;
    private int age;
    private String color;
    private String[] skills;

    public Hippogriff(String name, int age, String color, String[] skills) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.skills = skills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getColor() {
        return this.color;
    }

    public String[] getSkills() {
        return this.skills;
    }

    public Hippogriff() {
    }

    public Hippogriff(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Hippogriff(String name) {
        this.name = name;
    }

    public void eat(String food) {
        String[] foods = new String[]{"Cвекла", "Морковь", "Мясо", "Рыба", "Яблоко"};

        for(int i = 0; i < foods.length; ++i) {
            int count = 0;
            if (food.equals(foods[i])) {
                System.out.println("Гипогриф таким питается");
                count++;
                break;
            } else if (i == foods.length - 1) {
                System.out.println("Гипогриф не будет таким питаться");
            }
        }

    }

    public void fly() {
        if (this.age > 2) {
            System.out.println("Flying");
        } else {
            System.out.println("He is still baby");
        }

    }

    public String giveRide(Student student) {
        int isGivingRide = (new Random()).nextInt(1, 10);

        if (isGivingRide>0 && isGivingRide<4){
            return student.getName()+"летит на гиппогрифе!";

        } else if (isGivingRide>3 && isGivingRide<9) {
            return "гиппогриф демонстративно отворачивается и отказывается летать";

        }else return "студент должен попробовать снова";
    }
}
