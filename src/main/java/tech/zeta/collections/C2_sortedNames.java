package tech.zeta.collections;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

//2. Sorted Names: Given a list of names,
// use a TreeSet to store the names in alphabetical order and print the sorted list.
public class C2_sortedNames {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Ekta","Aryan","Rohan","Nandini","Shaan");
        System.out.println(names);
        TreeSet<String> sortedNames= new TreeSet<>(names);
        System.out.println(sortedNames);
    }
}
