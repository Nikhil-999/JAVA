import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClassInJava {
    public static void main(String[] args) {
        List<Integer> demo = new ArrayList<>();
        demo.add(69);
        demo.add(9);
        demo.add(6);
        demo.add(69+6);
        demo.add(6+9);
        
        Collections.sort(demo);
        System.out.println(demo);
        Collections.sort(demo,Comparator.reverseOrder());
        System.out.println(demo);

        

        System.out.println(Collections.min(demo));
        System.out.println(Collections.max(demo));
        System.out.println(Collections.frequency(demo,609));
    }
    
}
