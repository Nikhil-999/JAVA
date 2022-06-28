package ArrayAndCollectionCLass;

import java.util.Arrays;

public class ArrayClassInJava {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Arrays.fill(arr, 23);
        System.out.println(Arrays.toString(arr));
        arr[0] = 6;
        arr[1] = 99;
        arr[2] = 5;
        arr[3] = 0;
        arr[4] = 222;
        arr[5] = 999;
        arr[6] = 51;
        arr[7] = 40;
        arr[8] = 2;
        arr[9] = -8;
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 400));
    }
}
