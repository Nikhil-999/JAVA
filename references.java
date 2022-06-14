public class references {
    public static void main(String... a) {
        String name = "Nikhil SIngh";
        System.out.println(name);


        yoyo obj1 = new yoyo("FIRST");
        yoyo obj2 = obj1;
        System.out.print("The before any change : ");
        System.out.print(obj1.naam + " ");
        System.out.println(obj2.naam);

        //now changing value of one object.

        obj1.naam = "NAME CHANGED";
        System.out.print("The after changes : " + obj1.naam + " " + obj2.naam);


    }

    static class yoyo{
        String naam;
        yoyo(String naam){
            this.naam = naam;
        }
    }
}
