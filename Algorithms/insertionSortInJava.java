import java.util.Arrays;

public class insertionSortInJava {
    public static void main(String[] args) {
        int[] arr = {9,8,2,0,2,59,0,81,20,12};
        System.out.println(Arrays.toString(arr));
        
        for(int i=1 ; i<arr.length ; i++){
            int k = i;
            for(int j = i-1 ; j >= 0 ; j--,k--){
                if(arr[k] < arr[j]){
                    int temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
                else{
                    break;
                }
            } 
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
