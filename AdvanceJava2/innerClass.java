package AdvanceJava2;

import javax.sound.sampled.SourceDataLine;

public class innerClass{
    public static void main(String[] args) {
        System.out.println("Hello innerClass");
        OuterClass obj = new OuterClass();
        OuterClass.innerClass obj2 = obj.new innerClass();
        System.out.println(obj.x);
        System.out.println(obj2.y);
    }
}

class OuterClass{
    int x = 50;

    class innerClass{
        int y = 60;
    }
}