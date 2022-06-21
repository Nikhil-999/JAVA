package AdvanceJava;

public class StaticVsNonStatic {
    // This is static method and attributes
    static int x = 5;
    static void MyText(){
        System.out.println("This is normal function");
    }

    // This is public methods which has to be called using object
    public void Mypublic(){
        System.out.println("This is public method.");
    }
    public static void main(String[] args) {
        // System.out.println(x);
        MyText();
        StaticVsNonStatic obj = new StaticVsNonStatic();

        obj.Mypublic();
    }
}
