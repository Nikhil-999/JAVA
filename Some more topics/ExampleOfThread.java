public class ExampleOfThread extends Thread{
    public void Hello(){
        System.out.println("Hello function is running.");
    }
    public static void main(String[] args) {
        ExampleOfThread obj = new ExampleOfThread();
        obj.start();
    }
}
