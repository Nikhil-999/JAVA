package AdvanceJAVA;

public class Polymorphism {
    public static void main(String[] args) {
        human Ohuman = new human();
        parent Oparent = new parent();
        child Ochild = new child();
        human Ochild2 = new child();        //Creates a child object.
        Ohuman.sound();
        Oparent.sound();
        Ochild.sound();
        Ochild2.sound();
    }
}

class human {
    public void sound() {
        System.out.println("Human sound ...!!");
    }
}

class parent extends human {
    public void sound() {
        System.out.println("This is the sound of a PARENT");
    }
}

class child extends human {
    public void sound() {
        System.out.println("This is the sound of a CHILD");
    }
}