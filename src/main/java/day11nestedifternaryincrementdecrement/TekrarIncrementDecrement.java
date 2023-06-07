package day11nestedifternaryincrementdecrement;

public class TekrarIncrementDecrement {
    public static void main(String[] args) {
        //Ornek : Bir tane integer variable olusturun ve onu iki sekilde 5 artirin.
        int a = 15;
        a=a+5;
        System.out.println(a);
        a+=5;
        System.out.println(a);

        //Decrement
        int b = 10;
        b-=5;
        System.out.println(b);
        //Increment 2
        int c = 6;
        c*=2;
        System.out.println(c);
        //Decrement 2

        int d = 20;
        d/=2;
        System.out.println(d);

        //"1" ile increment
        int e = 12;
        e++;
        System.out.println(e);
        //"post-increment" ve "pre-increment"
        int g = 16;
        int h = g++;
        System.out.println(g);
        System.out.println(h);

        int i = 16;
        int k = ++i;
        System.out.println(i);
        System.out.println(k);







    }
}
