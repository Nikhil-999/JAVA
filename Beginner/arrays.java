import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int arr[] = {60,12,87,34,0,55,36,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));   //Prints complete array in string formatted form.
        // System.out.println(arr);        //Prints the base address of array
        int Key;
        System.out.print("Enter the number u want to search : ");
        Scanner r = new Scanner(System.in);
        Key = r.nextInt();
        r.close();
        System.out.println(Arrays.binarySearch(arr,Key));
    }
}
