package Beginner;

public class enhancedLoops {
    public static void main(String... args){
        int [] arr = {20,60,98,34,88,55,762,95};
        for(int number : arr){
            number++;
            System.out.print(number + " ");
        }
        System.out.println("");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
