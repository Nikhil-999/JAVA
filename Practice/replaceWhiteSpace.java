import java.util.Scanner;

public class replaceWhiteSpace {
    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        obj.close();
        System.out.println("This is before : " + s);
        s = myFunc(s);
        System.out.println("This is after : " + s);
    }

    static String myFunc(String s){
        String str = "";
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                str = str + "@40";
            }
            else{
                str = str + s.charAt(i);
            }
        }
        return str;
    }
}
