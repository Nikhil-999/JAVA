public class Thread_in_java {
    public static void main(String[] args) {
        demo obj1 = new demo();
        demo2 obj2 = new demo2();

        obj1.start();
        obj2.start();

    }
}

class demo extends Thread{
    public void run() {
        int i=1;
        while(i++<3000)
        System.out.println("Thread is running in demo class."); 
    }
}

class demo2 extends Thread{
    public void run() {
        int i=1;
        while(i++<3000)
            System.out.println("This is fun...!!");
    }
}