package CollectionsInJava;

import java.util.*;

public class PriorityQueueInJava {
    public static void main(String[] args) {
        //  PriorityQueue<Integer> pq = new PriorityQueue<>();
        //  or
        Queue<Integer> pq = new PriorityQueue<>();      //this is by default min heap implementation.
        Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());        //this is max-heap implementation.

        pq.offer(111);
        pq.offer(888);
        pq.offer(222);
        pq.offer(6660);

        
        pq2.offer(111);
        pq2.offer(888);
        pq2.offer(222);
        pq2.offer(6660);

        System.out.println(pq);     //Give priority to head element and suffle the queue such that head contain the smallest element in the queue.
        System.out.println(pq2);    //Give priority to head element and suffle the queue such that head contain largest element in the queue.

        System.out.println(pq.poll());
        System.out.println(pq2.poll());

        System.out.println(pq);
        System.out.println(pq2);

        System.out.println(pq.peek());
        System.out.println(pq2.peek());
    }
}
