public class ExampleOfThread extends Thread{
    public void run(){
        System.out.println("Hello function is running.");
    }
    public static void main(String[] args) {
        ExampleOfThread obj = new ExampleOfThread();
        obj.start();


        //here run function is already defined in thread class but 
        // as we have now implemented a function with the same name
        // so now it will be printed.
    }
}