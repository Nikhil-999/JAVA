package AdvanceJAVA;

public class Encapsulation {
    private String name;
    public String getValue(){
        return this.name;
        // OR use return name;
    }

    public void setValue(String name){
        this.name = name;
    }

    public void myText(){
        System.out.println("this is demo function.");
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setValue("Nikhil Singh");
        System.out.println(obj.getValue());
        obj.myText();
        String a = "Yoo whats up";
        a = "hey jas";
        System.out.println(a);
    }
}
