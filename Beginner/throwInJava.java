package Beginner;

public class throwInJava {
    public static void main(String[] args) {
        isValidAge(2);
    }

    static void isValidAge(int age){
        if(age >= 18){
            System.out.println("The entered age is valid..!!");
        }
        else{
            throw new ArithmeticException("INVALID AGE...");
        }
    }
}
