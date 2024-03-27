package org.hogwarts;

import org.hogwarts.beast.Hippogriff;
import org.hogwarts.items.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
      //  System.out.println("Oh, you’re a magician, friend! Welcome to Hogwarts!");
        // System.out.println();

        //System.out.println("1.1 ------------------------------------------------------------------------------------------");
        // peremennieAndTypes1();

        //System.out.println("1.2 ------------------------------------------------------------------------------------------");
        // peremennieAndTypes2();

        //System.out.println("1.3------------------------------------------------------------------------------------------");
        //peremennieAndTypes3();

//        System.out.println("2.1------------------------------------------------------------------------------------------");
//        string1();
//
//        System.out.println("2.2------------------------------------------------------------------------------------------");
//        castSpell();
//
//        System.out.println("3.1------------------------------------------------------------------------------------------");
//        ifElse();
//
//        System.out.println("3.2 Для использования раскоментируй ---------------------------------------------------------------------------------");
//        SoringHat soringHat = new SoringHat();
//        System.out.println(soringHat.sort());
//
//        System.out.println("4.1 Запуск мячей--------------------------------------------------------------------------------------");
//        Quidditch quidditch = new Quidditch();
//        quidditch.getBalls();
//
//        System.out.println("4.2 Пойман снич--------------------------------------------------------------------------------------");
//        quidditch.playGame();
//
//        System.out.println("4.3 Счетчик--------------------------------------------------------------------------------------");
//        sumFrom222To444();
//
//        System.out.println("5.1 Сравнить рецепт--------------------------------------------------------------------------------------");
//        sravnimRecept();
//
//        System.out.println("5.2 Ввод рецепта--------------------------------------------------------------------------------------");
//         Potion potion = new Potion();
//         potion.prepare();
//
//        System.out.println("5.3 Мин мак Алго--------------------------------------------------------------------------------------");
//         minMaxAlgo();

//        System.out.println("6.1 Рацион Гипогрифа--------------------------------------------------------------------------------------");
//        Hippogriff hippogriff = new Hippogriff();
//
//        System.out.println("6.2 Летаем Гипогриф --------------------------------------------------------------------------------------");
//        hippogriff.fly();
//         Student student = new Student("Al","ec0",13,null);
//        System.out.println(hippogriff.giveRide(student));
//
//        System.out.println("6.2 Создать 4 экземпляра --------------------------------------------------------------------------------------");
//        Hippogriff hippogriff0 =new Hippogriff("Saad");
//        Hippogriff hippogriff1 = new Hippogriff("Max",3,"White",null);
//        Hippogriff hippogriff2= new Hippogriff("Fara","black");
//        Hippogriff hippogriff3 = new Hippogriff();
//        hippogriff3.setName("Jaret");
//
//        System.out.println("7. EXCEPTIONS --------------------------------------------------------------------------------------");
//
 //       Student student1 = new Student("Alex","kaa",17,null);
//        Spell spell = new Spell("fire",7);
//        student.castSpell(spell);

        //System.out.println("8. Интерфейсы --------------------------------------------------------------------------------------");
          //  Car car = new Car(student1,10,false);

        //System.out.println("8. Collections and Comparator --------------------------------------------------------------------------------------");
//        List<Student> list = new ArrayList<>();
//
//        Student student1 = new Student("Alex","Puf",10,null);
//        Student student2 = new Student("Jo","Grif",15,null);
//        Student student3 = new Student("Sam","Sliz",8,null);
//        Student student4 = new Student("Dean","Cogt",19,null);
//        Student student5 = new Student("Marco","Sliz",6,null);
//
//        list.add(student1); list.add(student2);
//        list.add(student3); list.add(student4);
//        list.add(student5);
//
//        System.out.println("Сортировка по возрасту");
//        System.out.println("---------------------------------------------------------------------------");
//        list.sort(Student::compareTo);
//        list.forEach(System.out::println);
//
//        System.out.println("Сортировка по Алфавиту вверх факультета");
//        System.out.println("---------------------------------------------------------------------------");
//        list.sort(Comparator.comparing(Student::getFaculty));
//        list.forEach(System.out::println);
//
//        System.out.println("Сортировка по Алфавиту Вниз факультета");
//        System.out.println("---------------------------------------------------------------------------");
//        list.sort(((o1, o2) -> o2.getFaculty().compareTo(o1.getFaculty())));
//        list.forEach(System.out::println);


    }


    //1 Переменные и типы данных
    //1.1 Выведите на экран сначала строку teachers, затем все 5 строк с именами преподавателей
    public static void peremennieAndTypes1(){
        String dumbledore="dumbledore",
                mcgonagall="mcgonagall",
                snape="snape",
                lupin="lupin",
                hugrid="hugrid";

        String teachers = "School teachers:";

        System.out.println(teachers+dumbledore+mcgonagall+snape+lupin+hugrid);
    }

    //1.2  Давайте поставим оценки за две работы. и вычислим средний балл
    public static void peremennieAndTypes2(){
        int grade1 = new Random().nextInt(1,10);
        int grade2= new Random().nextInt(1,10);
        boolean result = grade1>5 && grade2>5;
        System.out.println("проверим, что оба числа больше 5: "+result);
        System.out.println("Средняя оценка: "+(double) (grade1+grade2)/2);
    }

    //1.3  Вычислить сумму остатков от деления.
    public static void peremennieAndTypes3(){
        int num= 4199 % 14 + 4199 % 15 + 4199 % 16;
        System.out.println("Сумма остатка от деления: "+num);
    }
    //------------------------------------------------------------------------------------------
    //2 Строки
    //2.1 индекс подстроки “ob”.
    public static void string1(){
        String word="";
        for (int i = 0; i <5; i++) {
            word=word+new Random().nextInt();
        }
        word=word.replace("1","i");
        word=word.replace("-","");
        word=word.replace("0","o");
        word=word.replace("6","b");

        System.out.printf("%s, %s , %d \n",word,word.contains("23"),word.indexOf("ob"));


    }
    //2 Строки
    //2.2 индекс подстроки “ob”.
    public static void castSpell() {
        String word = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";
        word=word.toLowerCase();
        int start = new Random().nextInt(0,50);
        String word1= word.substring(start,word.length());
        StringBuilder spell = new StringBuilder(word1);
        spell.reverse();
        char first= spell.charAt(0);
        char second= spell.charAt(1);
        spell.replace(0,1 ,String.valueOf(second));
        spell.replace(1,2,String.valueOf(first));

        System.out.println(spell);
    }

    //3 Ветвление
    //3.1 Задание на условие
    public static void ifElse(){
        int num1 = new Random().nextInt();
        int num2 = new Random().nextInt();

        if (num1%2==0 && num2%2==0){
            System.out.printf("Оба четные num1=%d, num2=%d",num1/2,num2/2);
        } else if (num1%2==0) {
            System.out.printf("Первое четное и сумма равна=%d",(num1/2)+num2);
        }
        else if (num2%2==0) {
            System.out.printf("Второе четное и сумма равна=%d",(num2/2)+num1);
        }
        else  System.out.printf("Ниодного четного сумма равна=%d",num2+num1);
    }

    //4 Циклы
    //4.3 Счетчик
    public static void sumFrom222To444() {
        int sum=222;
        for (int i = 223; i <445 ; i++) {
            sum=sum+i;
        }
        System.out.printf("Сумма чисел от 222 до 444 равна: %d",sum);
    }

    //5 Массив
    // 5.1 Сравнить рецепт
    public static void sravnimRecept(){
        String[] recipe = {"Засушенная чешуя василиска",
                "Частичка души лесной феи",
                "Капля сока вампирской розы",
                "Яд шершавого ядозуба",
                "Осколок кометы",
                "Слеза феникса"};

        String[] potion = new String[6];
        potion[2]="Капля сока вампирской розы";
        potion[5]="Слеза феникса";
        potion[0]="Засушенная чешуя василиска";
        potion[1]="Частичка души лесной феи";
        potion[3]="Яд шершавого ядозуба";
        potion[4]="Осколок кометы";

        System.out.println(Arrays.equals(recipe,potion));
    }

    //5 Массив
    // 5.3 Алгоритм наименьшего и наибольшего числа
    public static void minMaxAlgo(){
        int[] array = new int[]{4,2,5,9,3,1};
        int min=array[0];
        int max=array[0];
        for (int i = 1; i <array.length; i++) {
            if (min>array[i]) min=array[i];
            if (max<array[i]) max=array[i];
        }
        System.out.printf("Minimum =%d, Maximum=%d",min,max);
    }
}