package tech.zeta.collections;

public class A4_Book implements Comparable<A4_Book>{
    String title;
    String author;

    public A4_Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    @Override
    public int compareTo(A4_Book other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by "+ author;
    }
}
