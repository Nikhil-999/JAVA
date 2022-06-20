package AdvanceJAVA;

class human{
    public void sound(){
        System.out.println("Human sound ...!!");
    }
}

class parent extends human{
    public void sound(){
        System.out.println("This is the sound of a PARENT");
    }
}

class child extends human{
    public void sound(){
        System.out.println("This is the sound of a CHILD");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        child Oc = new child();
        Oc.sound();
    }
}
