package AdvanceJAVA;


public class inheritance extends parent{
    public static void main(String[] args) {
        inheritance obj = new inheritance();
        obj.parentFunction();
        System.out.println(obj.name);
        System.out.println("JElo");        
    }
}

class parent{
    protected String name = "Nikhil";
    public void parentFunction(){
        System.out.println("we are inside parent class.");
    }
}
