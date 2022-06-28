package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorsInJava{
    public static void main(String[] args) {
        ArrayList<Integer> demo = new ArrayList<>();
        demo.add(68);
        demo.add(77);
        demo.add(8);
        demo.add(33);
        demo.add(11);
        demo.add(50);

        int arr[] = new int[5];
        arr[0] = 6;
        arr[1] = 16;
        arr[2] = 65;
        arr[3] = 78;
        arr[4] = 59;
        
        System.out.println(demo);
        Iterator<Integer> yo = demo.iterator();
        
        while(yo.hasNext()){
            System.out.print(yo.next() + " ");
        }
        
    }
}