import java.util.Scanner;

public class removeAllOccurencesOfSubString {
    public static void main(String[] args) {
        String part = "abc";
        System.out.print("Enter the string : ");
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        obj.close();
        System.out.println("This is before : " + s);
        s = myFunc(s,part);
        System.out.println("This is after : " + s);
    }

    // static String myFunc(String s , String part){
        
    //     while(s.contains(part) && s != ""){
    //         s = s.replaceFirst(part, "");
    //     }

    //     return s;
    // }

    //  OR  

    static String myFunc(String s , String part){
        
        while(s.contains(part)){
            s = s.replaceFirst(part, "");
        }

        return s;
    }

}
