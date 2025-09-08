package tech.zeta.collections;

import java.util.TreeSet;

//      4. Modify the library catalog example to use a TreeSet to
//      store the books in the catalog, sorted by title.
public class A4_LibraryCatalog {
    public static void main(String[] args) {
        TreeSet<A4_Book> catalog= new TreeSet<>();

        catalog.add(new A4_Book("The Alchemist", "Paulo Coelho"));
        catalog.add(new A4_Book("A Tale of Two Cities", "Charles Dickens"));
        catalog.add(new A4_Book("The Hobbit", "J.R.R. Tolkien"));
        catalog.add(new A4_Book("Pride and Prejudice", "Jane Austen"));
        catalog.add(new A4_Book("To Kill a Mockingbird", "Harper Lee"));

        System.out.println("List of books sorted by title: ");
        for(A4_Book book: catalog){
            System.out.println(book);
        }
    }
}
