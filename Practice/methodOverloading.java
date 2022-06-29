

public class methodOverloading{
    public static void main(String... args){
        myMethod();
        System.out.println(myMethod(5.66, 2));
        System.out.println(myMethod(10, 98));
        System.out.println(myMethod("Hello ", "Nikhil"));
        System.out.println(myMethod("Growth Natives", 5));
    }

    static void myMethod(){
        System.out.println("Normal method without parameter and return value is called.");
    }

    static int myMethod(int a , int b){
        return a+b;
    }
    
    static double myMethod(Double a , int b){
        return a+b;
    }
    
    static char myMethod(String a , int b){
        return a.charAt(b);
    }
    
    static String myMethod(String a , String b){
        return a+b;
    }
}