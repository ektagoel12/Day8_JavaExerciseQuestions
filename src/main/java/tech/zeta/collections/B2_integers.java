package tech.zeta.collections;

import java.util.Collections;
import java.util.LinkedList;

//      2. Create a LinkedList of integers.
//      Write a method to reverse the order of the elements in the list.

public class B2_integers {
    public static void reverse(LinkedList<Integer> integers){
        Collections.reverse(integers);
    }

    public static void main(String[] args) {
        LinkedList<Integer> integers=new LinkedList<>();
        integers.addLast(1);
        integers.addLast(2);
        integers.addLast(3);
        integers.addLast(4);
        integers.addLast(5);
        System.out.println("Original linkedlist: "+ integers);
        reverse(integers);
        System.out.println("Reversed linkedlist: "+ integers);
    }
}
