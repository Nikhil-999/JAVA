public class ClassAndObject {
    public static void main(String[] args) {
        Headphones headphones1 = new Headphones("Sony", 2000);
        Headphones headphones2 = new Headphones("Boat", 2200);
        Headphones headphones3 = new Headphones("MI", 2500);
        
        System.out.println(headphones1.name);
        System.out.println(headphones2.name);
        System.out.println(headphones3.name);
    }


    static class Headphones{
        String name;
        long price;
        Headphones(String name , long price){
            this.name = name;
            this.price = price;
        }
    }
}