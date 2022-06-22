package AdvanceJava2;

public class enums {

    enum demo{RED,ORANGE,GREEN,BLUE}
    public static void main(String[] args) {
        demo a = demo.ORANGE;
        System.out.println(a);
        demo arr[] = demo.values();
        for(demo x: arr){
            System.out.print(x + " ");
        }
        System.out.println();
        switch(a){
            case RED:
            System.out.println("this is constant RED");
            break;
            case ORANGE:
            System.out.println("this is constant ORANGE");
            break;
            case BLUE:
            System.out.println("this is constant BLUE");
            break;
            case GREEN:
            System.out.println("this is constant GREEN");
            break;
        }
    }
}
