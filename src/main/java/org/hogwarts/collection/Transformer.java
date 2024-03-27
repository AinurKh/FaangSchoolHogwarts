package org.hogwarts.collection;

import java.util.ArrayList;
import java.util.List;

public class Transformer {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                List.of("", "a", "b", "ab", "ba", "z", "h", "", "heh", "")
        );

        System.out.println(transform(list));
    }
    public static List<String> transform(List<String> words){
        List<String>copy = new ArrayList<>(words);
        for (String s:copy){
            if (s.isBlank()){
                words.remove(s);
            }
        }
        copy=new ArrayList<>(words);

        for (String s:copy){
            if (s.length()<2){
                words.set(words.indexOf(s),s+s);
            }
        }
        return words;
    }
}
