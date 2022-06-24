import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsInJava {
    public static void main(String[] args) {
        Map<Integer, String> demo = new HashMap<>();
        demo.put(1, "Ash");
        demo.put(2, "Brad");
        demo.put(3, "Dave");
        demo.put(4, "Benedict");

        System.out.println(demo);
        System.out.println(demo.keySet());
        System.out.println(demo.values());
        System.out.println(demo.isEmpty());
        System.out.println(demo.containsKey(5));
        System.out.println(demo.containsValue("Nick"));
        System.out.println(demo.get(3));

        // TreeMap sort the input element according to key values.
        Map<Integer, String> demo2 = new TreeMap<>();

        demo2.put(15, "asNikhil");
        demo2.put(6, "Nikdsdsddhil");
        demo2.put(36, "Nikhisdssdl");
        demo2.put(8, "Nhgikhil");
        demo2.put(0, "jhjyNikhil");
        demo2.put(3, "rtNikhil");
        demo2.put(4, "qNikhil");
        System.out.println(demo2);
        demo2.remove(36);

        System.out.println(demo2);

    }

}
