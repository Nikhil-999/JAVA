import java.util.Scanner;

public class firstProgram{
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Enter number of lines u want to print : ");
        Scanner demo = new Scanner(System.in);
        int no_of_lines = demo.nextInt();
        demo.close();

        int i=no_of_lines;
        int m=0;
        while(i>=0){
            int j = 0;
            int k = i;
            while(j<no_of_lines){
                if(k>0){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                k--;
                j++;
            }

            j = 2;
            while(j<=m && i!=no_of_lines){
                System.out.print("*");
                j++;
            }
            m++;
            System.out.println();
            i--;
        }

        System.out.println();
    }
}