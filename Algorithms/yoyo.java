

public class yoyo {
    public static void main(String[] args) {
        System.out.println(call("daabcbaabcbc","abc"));
    }

    static String call(String s , String part){
        if(s.length() < part.length())
            return s;
        
        if(s==part)
            return "";

        while(s.contains(part)){
            
        }


        return s;
    }
}
