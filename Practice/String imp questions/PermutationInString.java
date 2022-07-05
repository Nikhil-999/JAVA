import java.util.Scanner;

public class PermutationInString{
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        System.out.print("Enter the value of s1 : ");
        String s1 = demo.nextLine();
        System.out.print("Enter the value of s2 : ");
        String s2 = demo.nextLine();
        demo.close();
        System.out.print("Is permutation exist or not : ");
        System.out.print(myFunc(s1,s2));
    }


    static boolean myFunc(String s1 , String s2){
        int arr1[] = new int[26];
        for(int i=0 ; i<s1.length() ; i++){
            int temp = s1.charAt(i) - 'a';
            arr1[temp]++;
        }

        int start = 0 , end = s1.length();
        while(end <= s2.length()){
            if(check(s2.substring(start, end)  ,   arr1))
            return true;
            start++;
            end++;
        }

        return false;
    }

    static boolean check(String substring , int[] arr1){
        int arr2[] = new int[26];
        for(int i=0 ; i<substring.length() ; i++){
            int temp = substring.charAt(i) - 'a';
            arr2[temp]++;
        }

        for(int i=0 ; i<26 ; i++){
            if(arr1[i] != arr2[i])
            return false;
        }
        return true;
    }
}