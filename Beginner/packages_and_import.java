public class packages_and_import {
    public static void main(String... x) {
        int a = 56;
        System.out.println(a);
        // abc nik = new abc();
        // nik.hell();
        abc.hell();
    }

    static class abc{
        static void hell(){
            System.out.println("Inside hell function.");
        }
    }
}
