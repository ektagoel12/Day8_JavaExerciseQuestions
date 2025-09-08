package tech.zeta.collections;

import java.util.HashMap;

//      3. Create a program that stores a mapping of country codes to country
//      names using a HashMap. Add at least 5 country codes and their
//      corresponding country names to the map.
//      Then, print the map.
public class A3 {
    public static void main(String[] args) {
        HashMap<String,String> countryMap=new HashMap<>();

        countryMap.put("IN", "India");
        countryMap.put("US", "United States");
        countryMap.put("UK", "United Kingdom");
        countryMap.put("CA", "Canada");
        countryMap.put("AU", "Australia");

        for (String code : countryMap.keySet()) {
            System.out.println(code + " -> " + countryMap.get(code));
        }

    }
}

