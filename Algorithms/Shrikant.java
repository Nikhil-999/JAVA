package Algorithms;

public class Shrikant extends car{
    
        private String modelname= "modelname";  //car attribute
        public static void main(String args[]) {
            Shrikant mycar= new Shrikant();
            mycar.honk();
            System.out.println(mycar.brand+ ""+ mycar.modelname);
        }

}

class car{
    protected String brand= "ford";
    protected void honk(){
        System.out.println("tutt, tutt");
    }
}