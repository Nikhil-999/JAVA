package CollectionsInJava;

import java.util.*;

public class QueueInJava {
    public static void main(String[] args) {
        Queue<Integer> demo = new LinkedList<>();
        demo.offer(565);
        demo.offer(111);
        demo.offer(7863);
        System.out.println(demo);
        System.out.println(demo.poll());
        System.out.println(demo);
        System.out.println(demo.peek());

        demo.add(4444);
        demo.add(5555);
        demo.add(6666);
        demo.add(7777);
        
    }    
}
