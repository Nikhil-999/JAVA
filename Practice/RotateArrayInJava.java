import java.util.Arrays;

public class RotateArrayInJava {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;

        System.out.println("Before rotating : ");
        System.out.println(Arrays.toString(arr));
        reverse(arr, 0 ,arr.length);
        reverse(arr, 0 , k);
        reverse(arr, k , arr.length);

        System.out.println("Before rotating : ");
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr , int start , int end){
        int s= start , e = end-1;
        while(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
