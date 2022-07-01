public class AdvancePalindromeInJava{
    public static void main(String[] args) {
        System.out.println(call("c1 O$d@eeD o1c"));
    }

    static boolean call(String s){
        int st = 0;
        int e = (s.length()-1);

        while(st<e){
            if(!isvalid(s.charAt(st))){
                st++;
                continue;
            }
            if(!isvalid(s.charAt(e))){
                e--;
                continue;
            }

            if(convert(s.charAt(st)) != convert(s.charAt(e))){
                return false;
            }
            st++;
            e--;
        }
        return true;
    }


    static boolean isvalid(char a){
        if((a>='a' && a<='z') || (a>='A' && a<='Z'))
        return true;

        return false;
    }

    static char convert(char a){
        if((a>='a' && a<='z')){
            return a;
        }
        // a = (char) (a - 'A' + 'a');              this is also work
        // return a;
        char temp = (char)(a - 'A' + 'a');           

        return temp;
    }
}
