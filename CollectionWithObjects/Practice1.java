package CollectionWithObjects;

import java.util.ArrayList;

public class Practice1{
    public static void main(String[] args) {
        ArrayList<emp> demo = new ArrayList<>();
        demo.add(new emp("Nikhil Singh", 22, "Uttar Pradesh"));
        demo.add(new emp("Shrikant Jaiswal", 22, "Uttar Pradesh"));
        demo.add(new emp("Nitin rana", 999, "Himachal Pradesh"));
        demo.add(new emp("XYZ", 00, "Delhi"));

        System.out.println(demo.get(1));
    }
}

class emp{
    String name;
    int age;
    String state;

    emp(String name, int age, String location){
        this.name = name;
        this.age = age;
        this.state = location;
    }

    public String toString(){
        return "Employee name : " + name + "\nEmployee age : " + age + "\nEmployee's HomeState : " + state;

    }
}