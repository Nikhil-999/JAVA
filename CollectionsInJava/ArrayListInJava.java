import java.util.*;

public class ArrayListInJava{
    public static void main(String[] args) {
        ArrayList<Integer> demo = new ArrayList<>();
        demo.add(99);
        demo.add(88);
        demo.add(77);
        demo.add(66);
        demo.add(55);
        demo.add(44);
        System.out.println(demo);

        Collections.sort(demo);
        System.out.println(demo);

        demo.add(2,11);
        System.out.println(demo);

        
        ArrayList<Integer> newArray = new ArrayList<>();
        newArray.add(2);
        newArray.add(2);
        newArray.add(2);
        newArray.add(2);

        demo.addAll(newArray);
        System.out.println(demo);

        System.out.println(demo.get(2));

        demo.remove(2);
        System.out.println(demo);

        demo.remove(Integer.valueOf(99));
        System.out.println(demo);

        demo.set(8,888);
        System.out.println(demo);               //toString method is invoked whenever we pass object to sout.
                                                //Every class has toString has method to print their objects easily.
        
        for(int i=0 ; i<demo.size() ; i++){
            System.out.print(demo.get(i) + " ");
        }
        System.out.println();

        for(int element: demo){
            System.out.print(element + " ");
        }
    }
}