package org.hogwarts.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 3, 6, 7, 5);
        Set<Integer> set = new HashSet<>(numbers);
        System.out.println(set);

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(2);
        set1.add(1);
        set1.add(4);
        set1.add(3);

        set2.add(2);
        set2.add(3);

        List<Integer>list = set1.stream().toList();
        List<Integer>list2 = set2.stream().toList();

        int count=0;

        System.out.println(list);
        System.out.println(list2);

        for (Integer s:list2){
            if (list.contains(s)){
                count++;
            }
            if (count==list2.size()){
                System.out.println("True");
                break;
            }
            if (s == list2.get(list2.size() - 1)){
                System.out.println("False");
            }
        }





    }
}
