import java.util.ArrayList;
import java.util.Collections;

public class AddTwoArrayInJava {
    public static void main(String[] args) {
        int[] arr1 = {9,9};
        int[] arr2 = {9,9};
        int size1 = 2;
        int size2 = 2;
        
        ArrayList<Integer> ans = new ArrayList<>();
        int ptr1 = size1-1 , ptr2 = size2-1;
        int carry = 0;

        while(ptr1>=0 && ptr2>=0){
            int sum = arr1[ptr1] + arr2[ptr2] + carry;
            if(sum > 9){
                ans.add(sum%10);
                carry = sum/10;
            }
            else{
                ans.add(sum);
                carry = 0;
            }

            ptr1--;
            ptr2--;
        }

        while(ptr1>=0){
            int sum = arr1[ptr1] + carry;
            if(sum > 9){
                ans.add(sum%10);
                carry = sum/10;
            }
            else{
                ans.add(sum);
                carry = 0;
            }

            ptr1--;
        }

        while(ptr2>=0){
            int sum = arr1[ptr2] + carry;
            if(sum > 9){
                ans.add(sum%10);
                carry = sum/10;
            }
            else{
                ans.add(sum);
                carry = 0;
            }

            ptr2--;
        }

        if(carry != 0);
        ans.add(carry);

        Collections.reverse(ans);
        System.out.println(ans);
    }
}
