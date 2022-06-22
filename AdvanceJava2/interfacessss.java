package AdvanceJava2;


public class interfacessss{
    public static void main(String[] args) {
     abc obj = new abc();
     obj.method2();   
     System.out.println(obj.method1(10)); 
     obj.method3();
    }
}
interface inter1{
    public int method1(int a);
    public void method2();
}

interface inter2{
    public void method3();
}

class abc implements inter1, inter2{
    public int method1(int q){
        return q+8;
    }
    public void method2(){
        System.out.println("This is method 2");
    }
    public void method3() {
        System.out.println("This is method 3");
    }
}