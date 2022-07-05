import java.util.Scanner;

public class RemoveAllAdjacentCharacterInString {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        System.out.print("Enter the value of s1 : ");
        String s = demo.nextLine();
        demo.close();
        System.out.println("Before changes : " + s);
        s = myFunc(s);
        System.out.print("After changes : " + s);
    }

    static String myFunc(String s){
        String str = "";

        for(int i =0 ; i<s.length() ; i++){
            if(str.isEmpty()){
                str += s.charAt(i);
                continue;
            }

            if(str.charAt(str.length()-1) == s.charAt(i)){
                str = str.substring(0, str.length()-1);
            }
            else{
                str += s.charAt(i);
            }
        }

        return str;
    }
}
