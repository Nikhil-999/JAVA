import java.util.ArrayList;

public class ReverseWordsInString {
    public static void main(String[] args) {
        ArrayList<Character> s = new ArrayList<>();
        s.add('t');
        s.add('h');
        s.add('e');

        s.add(' ');

        s.add('s');
        s.add('k');
        s.add('y');

        s.add(' ');

        s.add('i');
        s.add('s');

        s.add(' ');

        s.add('b');
        s.add('l');
        s.add('u');
        s.add('e');

        // ArrayList<Character> demo = new ArrayList<>();
        // demo.add('a');

        System.out.println();
        System.out.println("Before reversing the words : ");
        System.out.println(s);
        System.out.println();

        
        myCompleteReverse(s);

        System.out.println("After reversing the words : ");
        System.out.println(s);
        System.out.println();
    }

    static void myCompleteReverse(ArrayList<Character> s){
        
        int len = s.size();
        int counterPrev = -1 , counternext = 0 , i=0;
        while(len != 0){
            if(s.get(i) == ' '){
                counternext = i;
                myReverse(s,counterPrev+1,counternext);
                counterPrev = counternext;
            }
            i++;
            len--;
        }
        myReverse(s, counterPrev+1, s.size());
        myReverse(s, 0, s.size());
    }


    static void myReverse(ArrayList<Character> s , int counterPrev , int counternext){
        int e = counternext-1;
        while(counterPrev <= e){
            char temp = s.get(counterPrev);
            s.set(counterPrev, s.get(e));
            s.set(e, temp);
            counterPrev++;
            e--;
        }
    }
}