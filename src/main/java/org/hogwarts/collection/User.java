package org.hogwarts.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class User {
    private String name;
    private int age;
    private String work;
    private String address;

    static  List<String> VALID_JOBS= List.of("Google","Uber","Amazon");
    static  List<String> VALID_ADDRESSES= List.of("London","New York","Amsterdam");
    public User(String name, int age, String work, String address) {
        if (name!=null) {
            this.name = name;

        } else throw new IllegalArgumentException("name cannot be null");

        if (age>17){

            this.age = age;
        } else throw new IllegalArgumentException("age cannot be lower 18");

        if (VALID_JOBS.contains(work)){

            this.work = work;
        } else throw new IllegalArgumentException("Invalid Work");

        if (VALID_ADDRESSES.contains(address)){

            this.address = address;
        }else throw new IllegalArgumentException("Invalid Address");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work='" + work + '\'' +
                ", adress='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(work, user.work) && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, work, address);
    }

    public static void main(String[] args) {
        User user1 = new User("Ainur",18,"Uber","London");
//        User user2 = new User("Aidar",24,"Alabuga","Kazan");
//        User user3 = new User("Andrei",17,"IP","Moscow");
//        User user4 = new User("Karim",17,"JAVA","Anapa");
//        User user5 = new User("Denis",18,"Nio","New-York");

//        List<User> list= new ArrayList<>();
//        list.add(user1);list.add(user2);list.add(user3);
//        list.add(user4);list.add(user5);

//        System.out.println(groupUsers(list));
    }
    public static Map<Integer,List<User>> groupUsers(List<User> users){
        Map<Integer,List<User>> result = new HashMap<>();
        for (User u:users){
            result.put(u.getAge(),users.stream().filter(s->u.getAge()== s.age).toList());
        }
        return result;
    }
}
