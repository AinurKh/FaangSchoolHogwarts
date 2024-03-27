package org.hogwarts.collection;

import java.util.HashMap;

public class CountOccurrences {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 3, 4, 5, 1,4,4,4,4,4};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key =arr[i];
            if (map.containsKey(key)){
                int value = map.get(key)+1;
                map.put(key,value);
                continue;
            }
            map.put(key,1);
        }
        System.out.println(map);
    }
}
