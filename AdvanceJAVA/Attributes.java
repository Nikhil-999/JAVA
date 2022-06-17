package AdvanceJAVA;

public class Attributes{
    int marks = 89;
    public static void main(String[] args) {
        Attributes obj = new Attributes();
        Attributes obj2 = new Attributes();
        obj2.marks = 60;
        // obj.marks = 50;
        System.out.println(obj.marks);
        System.out.println(obj2.marks);

    }
}