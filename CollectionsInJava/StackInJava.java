import java.util.*;

public class StackInJava {
    public static void main(String[] args) {
        Stack<String> demo = new Stack<String>();
        demo.push("Orange");
        demo.push("Red");
        demo.push("Green");
        demo.push("Black");
        System.out.println(demo);
        for(String element: demo){
            System.out.print(element + " ");
        }
        System.out.println();
        demo.pop();
        System.out.println(demo);
        System.out.println(demo.peek());
    }
}
