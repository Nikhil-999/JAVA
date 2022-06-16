package Practice;

public class reverse{
    public static void main(String... args){
        String demo = "Nikhil Singh";
        String ans = "";
        System.out.println(demo);
        int n = demo.length();
        for(int i=0 ; i<n ; i++){
            char temp = demo.charAt(n-1-i);
            ans += temp;
        }
        System.out.println(ans);
    }
}