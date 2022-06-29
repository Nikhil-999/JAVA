public class CheckRotatedInJava {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(check(arr));
    }

    static boolean check(int[] arr){
        int count = 0;
        for(int i=0 ; i<arr.length-1 ; i++){
            if(arr[i] > arr[i+1])
            count++;

            if(count>1)
            return false;
        }
        
        if(arr[0] < arr[arr.length-1]  && count!=0  )
        return false;
        
        return true;
    }
}
