import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableInJava{
    public static void main(String[] args) {
        Hashtable<String , Integer> demo = new Hashtable<>(20);
        demo.put("Nikhil", 20);
        demo.put("Nik", 2000);
        demo.put("a", 20);
        demo.put("b", 20);
        demo.put("c", 20);
        System.out.println(demo.remove("Nikhil",20));    
        System.out.println(demo);   

        System.out.println("This is the hash code for the map : "+demo.hashCode());
        System.out.println(demo.getOrDefault("Singh",2));

        System.out.println(demo.values());

        for(Integer a : demo.values()){
            System.out.println("This is the value in hashtable : " + a);
        }


        System.out.println(demo.keySet());
        System.out.println(demo.keys());

        Enumeration<Integer> demoEnum = demo.elements();
        while(demoEnum.hasMoreElements()){
            System.out.println(demoEnum.nextElement());
        } 

        System.out.println(demo.isEmpty());

        int nik[] = {10,20};
        demoFunc(nik);
        System.out.println(Arrays.toString(nik));
    }

    public static void demoFunc(int yoy[]){
            yoy[0]++;
            yoy[1]++;
    }
}