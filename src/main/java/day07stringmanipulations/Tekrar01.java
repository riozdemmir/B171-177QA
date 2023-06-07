package day07stringmanipulations;

public class Tekrar01 {
    public static void main(String[] args) {
        String t = "Ridvan 32 yasindadir!...";
        //Ornek1: "t" stringindeki tum rakamlari "*" ceviriniz
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println("t1 = " + t1);

        //Ornek 2: "t" stringindeki tum rakamlari ve harfleri "!" e ceviriniz
        String t2 = t.replaceAll("[0-9a-zA-z]","?");
        System.out.println("t2 = " + t2);

        //Ornek 3: "t" stringindeki tum sesli harfleri "?" e ceviriniz
        String t3 = t.replaceAll("[aeiouAEIOU]","!");
        System.out.println("t3 = " + t3);

        //Ornek 4:  "t" stringindeki kucuk harfler disindaki tum characterleri "<>" ceviriniz
        String t4 =t.replaceAll("[^a-z]","<>");
        System.out.println("t4 = " + t4);

        //Ornek 5: "t" stringindeki tum harfler disindaki tum characterleri "+" ceviriniz
        String t5 = t.replaceAll("[^a-zA-Z]","+");
        System.out.println("t5 = " + t5);

        //Ornek 6: "t" stringindeki space ler disindaki tum characterleri "?" e ceviriniz
        String t6 = t.replaceAll("[^ ]","?");
        System.out.println("t6 = " + t6);

        //Ornek 7:  "t" stringindeki sesli harfler disindaki tum characterleri "&" e ceviriniz
        String t7 = t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("t7 = " + t7);


    }
}
