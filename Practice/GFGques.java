

import java.util.TreeSet;

public class GFGques {
    public static void main(String[] args) {
        int[] arr = {10,2,50,12,48,13};
        int k1 = 2, k2 = 6;
        TreeSet<Integer> demo = new TreeSet<>();
        int n = arr.length;

        for(int i=0 ; i<n ; i++){
            demo.add(arr[i]);
        }
        System.out.println(demo);
        boolean check = false;
        int sum = 0;
        int counter = 1;
        for(int a: demo){
            if(counter == k1){
                check = true;
                counter++;
                continue;
            }
            if(counter == k2){
                check = false;
            }
            if(check){
                sum+=a;
            }
            counter++;
        }

        System.out.println(sum);
        
    }
}
