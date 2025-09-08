package tech.zeta.collections;

import java.util.HashSet;

//2. Create a program that stores a set of unique email addresses using a HashSet.
// Add at least 5 email addresses to the set. Ensure that there are no duplicate email addresses in the set.
//Then, print the set of email addresses.
public class A2 {
    public static void main(String[] args) {
        HashSet<String> emails= new HashSet<>();

        emails.add("eklavya@gmail.com");
        emails.add("aryan12@gmail.com");
        emails.add("arohi34@gmail.com");
        emails.add("krishna34@gmail.com");
        emails.add("ryan12@gmail.com");

        System.out.println("List of emails");
        for(String email: emails){
            System.out.println(email);
        }
    }
}
