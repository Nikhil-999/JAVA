package AdvanceJava2;

public class Abstraction {
    public static void main(String[] args) {
        Child22 obj = new Child22();
        obj.childFun();
        obj.sound();
    }
}

class Child22 extends parent{
    public void childFun(){
        System.out.println("this is child function inside child class.");
    }
    public void sound(){
        System.out.println("This is sound function which is declared inside parent class but its body is given inside child class.");
    }
}

abstract class parent{
        public abstract void sound();
        public void myFun(){
            System.out.println("This is my function inside abstract class.");
        }
}