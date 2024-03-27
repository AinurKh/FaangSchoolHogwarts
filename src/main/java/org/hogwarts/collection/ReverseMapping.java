package org.hogwarts.collection;

import java.util.HashMap;
import java.util.stream.Stream;

public class ReverseMapping {
    public static void main(String[] args) {
        HashMap<String, String> capitalCountryMap = new HashMap<>();
        capitalCountryMap.put("Paris", "France");
        capitalCountryMap.put("Berlin", "Germany");
        capitalCountryMap.put("Rome", "Italy");

        HashMap<String, String> countryCapitalMap = new HashMap<>();

        capitalCountryMap.forEach((o1,o2)->countryCapitalMap.put(o2,o1));

        System.out.println(capitalCountryMap);
        System.out.println(countryCapitalMap);


    }
}
