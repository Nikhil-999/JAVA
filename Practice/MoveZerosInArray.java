import java.util.Arrays;

public class MoveZerosInArray {
    public static void main(String[] args) {
        int arr[] = {0};
        int zero = 0 , nonZero = 0;
        System.out.println("Before moving zeros : ");
        System.out.println(Arrays.toString(arr));
        while(zero<arr.length && nonZero<arr.length){
            if(arr[zero] != 0){
                zero++;
                continue;
            }
            if(arr[nonZero] == 0){
                nonZero++;
                continue;
            }
            
            //Swapping numbers below 
            int temp = arr[zero];
            arr[zero] = arr[nonZero];
            arr[nonZero] = temp;

        }

        System.out.println("After moving zeros : ");
        System.out.println(Arrays.toString(arr));
    }
}
