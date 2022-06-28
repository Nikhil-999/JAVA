package AdvanceJava2;

import java.util.ArrayList;

public class LambdaInJava {
    public static void main(String[] args) {
        ArrayList<Integer> demo = new ArrayList<>();
        demo.add(60);
        demo.add(88);
        demo.add(27);
        demo.add(34);

        demo.forEach((n)->{System.out.println(n);});
        
    }
}
