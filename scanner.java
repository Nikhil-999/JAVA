import java.util.Scanner;

public class scanner {
    public static void main(String... args) {
        System.out.println("Hey..!! What is your name : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Nice to meet you "+ name);
        int age = scanner.nextInt();
        System.out.println("Your age is : " + age);
        scanner.close();
    }
}
