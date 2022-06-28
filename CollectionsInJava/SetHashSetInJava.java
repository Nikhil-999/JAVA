package CollectionsInJava;

import java.util.*;

public class SetHashSetInJava {
    public static void main(String[] args) {
        Set<Integer> demo = new HashSet<>();


        //Below 3 types of set classes follow one same rule
        // i.e they don't accept duplicates.


        //order is not maintained
        demo.add(98);
        demo.add(88);
        demo.add(77);   
        demo.add(66);
        
        demo.add(77);   
        demo.add(66);

        System.out.println(demo);


        Set<Integer> demo2 = new TreeSet<>();

        //automatic sorts
        demo2.add(11);
        demo2.add(1);
        demo2.add(110);
        demo2.add(56);
        demo2.add(51);
        demo2.add(11);
        demo2.add(81);


        System.out.println(demo2);

        Set<Integer> demo3 = new LinkedHashSet<>();

        //order of insertion is maintained.
        demo3.add(45);
        demo3.add(22);
        demo3.add(35);
        demo3.add(47);
        demo3.add(450);

        System.out.println(demo3);
    }
}
