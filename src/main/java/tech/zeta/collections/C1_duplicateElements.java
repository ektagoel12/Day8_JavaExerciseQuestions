package tech.zeta.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//      1. Duplicate Removal: Given a list of strings,
//      use a HashSet to remove all duplicate strings and print the unique strings.
public class C1_duplicateElements {
    public static void main(String[] args) {
        List<String> strings=  Arrays.asList("Hello","Hello","world","CPP","CPP","Java");

        System.out.println(strings);

        HashSet<String> uniqueStrings= new HashSet<>(strings);

        System.out.println(uniqueStrings);


    }
}
