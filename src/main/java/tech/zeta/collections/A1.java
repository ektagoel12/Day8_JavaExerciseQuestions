package tech.zeta.collections;

import java.util.ArrayList;

//Create a program that stores a list of student names using an ArrayList.
// Add at least 5 student names to the list.
// Then, print the list of student names.
public class A1 {
    public static void main(String[] args) {
        ArrayList<String> students= new ArrayList<>();

        students.add("Ram");
        students.add("Shyam");
        students.add("Divya");
        students.add("Arohi");
        students.add("Aryan");

        System.out.println("List of students");
        for(String student: students){
            System.out.println(student);
        }
    }
}

