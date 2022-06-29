import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {5,10,20,30,50,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int arr2[] = {1,2,6,8,9,15,25,28,30,35,36,45,51,78};
        int SizeOne = 5 , SizeTwo = 14;
        int ptr1 = SizeOne-1 , ptr2 = SizeTwo-1 , ptr3 = SizeOne + SizeTwo - 1;
        while(ptr1>=0 && ptr2>=0){
            if(arr1[ptr1] > arr2[ptr2]){
                arr1[ptr3] = arr1[ptr1];
                ptr3--;
                ptr1--;
            }else{
                arr1[ptr3] = arr2[ptr2];
                ptr3--;
                ptr2--;
            }
        }

        while(ptr1>=0){
            arr1[ptr3] = arr1[ptr1];
            ptr1--;
            ptr3--;
        }

        
        while(ptr2>=0){
            arr1[ptr3] = arr1[ptr2];
            ptr2--;
            ptr3--;
        }

        System.out.println(Arrays.toString(arr1));
        
     }
}
