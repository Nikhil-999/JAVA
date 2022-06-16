package Practice;

public class palindrome {
    public static void main(String... args) {
        String a = "able was I ere I saw elba";
        System.out.println(ispalindrome(a));
    }

    static boolean ispalindrome(String a){
        int n = a.length();
        int l=0 , r=n-1;
        while(l<=r){
            if(a.charAt(l) != a.charAt(r))
            return false;
            r--;
            l++;
        }


        return true;
    }
}
