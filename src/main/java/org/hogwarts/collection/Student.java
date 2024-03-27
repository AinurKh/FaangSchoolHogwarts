package org.hogwarts.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Student {
    private String name;
    private String faculty;
    private int year;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return year == student.year && Objects.equals(name, student.name) && Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, faculty, year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Student(String name, String faculty, int year) {
        this.name = name;
        this.faculty = faculty;
        this.year = year;
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student student1 = new Student("ainur","grif",3);
        Student student2 = new Student("aidar","cogt",4);
        Student student3 = new Student("karim","sliz",1);
        Student student4 = new Student("denis","puff",5);
        Student student5 = new Student("marsel","sliz",2);

        list.add(student1); list.add(student2);
        list.add(student3); list.add(student4);
        list.add(student5);

        System.out.println(getMap(list));

        addStudent(list,new Student("Oleg","puff",3));

        System.out.println(list);

        System.out.println(getByFaculty(list,"puff"));

        System.out.println(getByYear(list,3));
    }
    public static HashMap<Map.Entry, List<Student>> getMap(List<Student> list){
        HashMap<String,Integer>firstKeyMap=new HashMap<>();
        HashMap<Map.Entry,List<Student>> result = new HashMap<>();
        for (Student s:list){
            firstKeyMap.put(s.getFaculty(), s.getYear());
        }
        for (Map.Entry<String,Integer>entry:firstKeyMap.entrySet()){
            result.put(entry,list.stream().filter(s ->s.getFaculty().equals(entry.getKey())
                                                    && s.getYear()== entry.getValue()).toList());
        }

        return result;
    }

    public static void addStudent(List<Student> list, Student student){
        list.add(student);
    }
    public static void removeStudentByName(List<Student> list, String name){
        list.removeIf(s -> name.equals(s.getName()));
    }

    public static void removeStudentByFaculty(List<Student> list, String faculty){
        list.removeIf(s -> faculty.equals(s.getName()));
    }
    public static void removeStudentByYear(List<Student> list, Integer year){
        list.removeIf(s -> year== s.getYear());
    }

    public static void searchStudentByFaculty(List<Student> list, String faculty){
        for (Student s:list){
            if (faculty.equals(s.getFaculty())) System.out.println(s);
        }
    }

    public static void searchStudentByYear(List<Student> list, Integer year){
        for (Student s:list){
            if (year== s.getYear()) System.out.println(s);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", year=" + year +
                '}';
    }

    public static List<Student> getByFaculty(List<Student> list, String faculty){
        return list.stream().filter(s -> faculty.equals(s.getFaculty())).toList();
    }

    public static List<Student> getByYear(List<Student> list, Integer year){
        return list.stream().filter(s -> year== s.getYear()).toList();
    }


}
