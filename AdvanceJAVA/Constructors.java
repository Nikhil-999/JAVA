package AdvanceJava;

public class Constructors{
    int mark = 46;

    Constructors(){}

    Constructors(int mark){
        this.mark = mark;
    }
    public static void main(String[] args) {
        Constructors obj = new Constructors(999);
        Constructors obj2 = new Constructors();

        System.out.println(obj.mark);
        System.out.println(obj2.mark);
        
    }
}