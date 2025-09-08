package tech.zeta.collections;

public class B3_queue_main {
    public static void main(String[] args) {
        B3_queue queue= new B3_queue();

        queue.B3_enqueue(12);
        queue.B3_enqueue(13);
        queue.B3_enqueue(14);
        queue.B3_enqueue(15);

        queue.B3_display();

        queue.B3_dequeue();
        queue.B3_display();

        queue.B3_peek();
    }
}
