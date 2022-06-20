package AdvanceJAVA;


// This is multiLevel inheritance.

public class inheritance extends Parent{
    public static void main(String[] args) {
        inheritance obj = new inheritance();
        obj.GrandParentFunction();
        obj.parentFunction();
        System.out.println(obj.name);
        System.out.println("Hey, i am in the main function.");        
    }
}

class Parent extends GrandParent{
    protected String name = "This is a string attribute called from parent class";
    public void parentFunction(){
        System.out.println("This function is called from parent class.");
    }
}

class GrandParent{
    protected void GrandParentFunction(){
        System.out.println("This function is called from Grand parent class..!!");
    }
}
