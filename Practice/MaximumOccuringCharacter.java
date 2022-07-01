public class MaximumOccuringCharacter {
    public static void main(String[] args) {
        String demo = "abcdaadddddddbccaadh";

        System.out.println("Maximum occuring character is : ");
        System.out.println(myMaxiCharacter(demo));
    }

    static char myMaxiCharacter(String demo){
        int[] count = new int[26];  
        int len = demo.length();
        int j=0;
        while(len != 0){
            // System.out.println(demo.charAt(j) - 'a');
            count[(demo.charAt(j) - 'a')]++;
            len--;
            j++;
        }
        int maxi = 0 , index = 0;
        for(int i=0 ; i<26 ; i++){
            // System.out.println(count[i]);
            if(maxi < count[i]){
                maxi = count[i];
                index = i;
            }
        }
        return (char)('a' + index);
    }
}
