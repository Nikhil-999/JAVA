package Algorithms;

import java.util.Arrays;

public class SelectionSortInJava {
    public static void main(String[] args) {
        int[] arr = {2, 8, 1, 3, 6, 7, 5, 4};
        System.out.println(Arrays.toString(arr));
        for(int i=0 ; i<arr.length-1 ; i++){
            int index = i;
            for(int j=i ; j<arr.length ; j++){
                if(arr[j] <= arr[index]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}


//This sorting algo is considered to be not Stable.
// but it can be modified to make it stable.            --refer GFG.