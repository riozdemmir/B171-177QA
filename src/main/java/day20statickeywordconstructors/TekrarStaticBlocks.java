package day20statickeywordconstructors;

public class TekrarStaticBlocks {
    static double add;
    static String isim;

    static {
        isim="Ridvan";
        System.out.println(isim);
    }
    static {
        add=12.99;
        System.out.println(add);
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        System.out.println(add);
        System.out.println(isim);
    }



}
