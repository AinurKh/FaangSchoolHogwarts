package org.hogwarts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String faculty;
    private int age;
    private String[] skills;

    public String getName() {
        return this.name;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public int getAge() {
        return this.age;
    }

    public String[] getSkills() {
        return this.skills;
    }

    public void castSpell(Spell spell) {
        if (this.age>11 && this.age<17){
            if (spell.getPower()<=this.age-10){
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            } else {
                throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать " + spell.getTitle());
            }

        } else if (this.age <= 11) {
            if (spell.getPower() == 1) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            } else {
                throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать " + spell.getTitle());
            }
        } else {
            System.out.println("Может использовать вообще все заклинания");
        }
    }


    public Student(String name, String faculty, int age, String[] skill) {
        if (age<1){
            throw new IllegalArgumentException("ОШИБКА ВВОДА ВОЗРАСТА");
        }
        skill = new String[3];
        this.name = name;
        this.faculty = faculty;
        this.age = age;
        this.skills = skill;
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", age=" + age +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(faculty, student.faculty) && Arrays.equals(skills, student.skills);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, faculty, age);
        result = 31 * result + Arrays.hashCode(skills);
        return result;
    }
}
