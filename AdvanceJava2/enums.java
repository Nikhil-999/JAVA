package AdvanceJava2;

public class enums {

    enum demo{RED,ORANGE,GREEN,BLUE}
    public static void main(String[] args) {
        demo a = demo.BLUE;
        System.out.println(a);
        demo arr[] = demo.values();
        for(demo x: arr){
            System.out.print(x + " ");
        }
    }
}
