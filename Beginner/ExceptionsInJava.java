package Beginner;

public class ExceptionsInJava {
    public static void main(String[] args) {
        System.out.println();
        try{
            int[] arr = {2,6,9,0};
            System.out.println(arr[5]);
        }
        catch(Exception a){
            System.out.println("Buddy error agaya hai..!!! \n\n"+a);
        }
        finally{
            System.out.println();
            System.out.println("This is 'finally' bloak being executed regardless of outcome of try and catch.\n");
        }
    }
}
