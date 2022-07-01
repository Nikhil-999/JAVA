package Algorithms;

import java.util.Arrays;

public class BubbleSortInJava {
    public static void main(String[] args) {
        // int arr1[];
        // OR 
        // int[] arry;
        // OR
        // int[] arr = new int[5];
        // or
        // int[] arrz = new int[]{1,6,9};

        //Bubble sort starts here

        int arr[] = {6,89,2,51,9,4,102,0,3};

        System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1 ; i>0 ; i--){

            for(int j=0 ; j<i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
