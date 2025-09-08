package tech.zeta.collections;

import java.util.LinkedList;
import java.util.NoSuchElementException;

//      3. Implement a simple queue using a LinkedList.
//      The queue should have methods to enqueue (add an element to the end),
//      dequeue (remove an element from the beginning),
//      and peek (view the first element without removing it).
public class B3_queue {
    LinkedList<Integer> queue;

    public B3_queue(){
        queue= new LinkedList<>();
    }

    public void B3_enqueue(int element){
        queue.addLast(element);
    }

    public int B3_dequeue(){
        try{
            int removed=queue.removeFirst();
            System.out.println(removed+ " : Removed");
            return removed;
        } catch (NoSuchElementException e){
            System.out.println("Queue is empty., so can't dequeue");
            return -1;
        }
    }

    public int B3_peek(){
        try{
            int topElement=queue.getFirst();
            System.out.println(topElement+ " : top Element in queue");
            return topElement;
        } catch (NoSuchElementException e){
            System.out.println("Queue is empty.");
            return -1;
        }
    }

    public void B3_display(){
        System.out.println("Queue: "+ queue);
    }
}
