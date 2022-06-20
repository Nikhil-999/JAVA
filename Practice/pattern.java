package Practice;

public class pattern {
    public static void main(String[] args) {

        int i = 5;
        int z = 0;
        int count;
        while (i >= 1) {
            int j = 1;
            count = i - 1;
            while (j <= 5) {
                if (count > 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                count--;
                j++;
            }
            int k = 0;
            while (k <= z) {
                if (k == 0) {
                    k++;
                    continue;
                }
                System.out.print("*");
                k++;
            }
            System.out.println();
            i--;
            z++;
        }
    }
}
