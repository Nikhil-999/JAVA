public class ThreadUsingInterfaceRunnable implements Runnable{
    public void run(){
        int i = 0;
        while(i++<100)System.out.println("This is run function declared inside runnable interface but implemented inside the class.");
    }
    public static void main(String[] args) {
        Thread obj = new Thread(new ThreadUsingInterfaceRunnable());
        obj.start();

        
        try{
            int i=0;
            while(i++<10){

                Thread.sleep(2000);
                System.out.println("This is sleep");
                (new Thread(new myClass())).start();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}


class myClass implements Runnable{
    public void run(){
        int i=2;
        while(i++<10)System.out.println("This is my class thread.");
    }
}