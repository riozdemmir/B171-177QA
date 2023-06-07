package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tekrar02 {
    public static void main(String[] args) {

        //Bir listin baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        //iki listin esit olabilmesi icin ayni index te ayni elemanlar olmalidir
        ArrayList<String> names=new ArrayList<>();
        names.add("Mehmet");
        names.add("Toni");
        names.add("Coni");

        ArrayList<String> names2=new ArrayList<>();
        names2.add("Mehmet");
        names2.add("Coni");
        names2.add("Toni");
        boolean result=names.equals(names2);
        System.out.println(result);
        //Ornek: Verilen iki integer listte tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz

        ArrayList<Integer>ages=new ArrayList<>();
        ages.add(12);
        ages.add(9);
        ages.add(14);
        ArrayList<Integer>ages2=new ArrayList<>();
        ages2.add(12);
        ages2.add(14);
        ages2.add(9);
        Collections.sort(ages);
        Collections.sort(ages2);

        boolean sonuc=ages.equals(ages2);
        System.out.println(sonuc);
        //ArrayListte bir elemanin ilk gorunumu nasil silinir?
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Yozgat");
        System.out.println(cities);//[Miami, Istanbul, Yozgat, Barcelona, Miami, Istanbul, Istanbul, Yozgat]
        System.out.println(cities.remove("Yozgat"));
        System.out.println(cities);
        System.out.println(cities.remove(2));
        System.out.println(cities);

        //Ornek : Bir integer list olusturun ve 12 elemanini siliniz
        List<Integer> yas=new ArrayList<>();
        yas.add(12);
        yas.add(9);
        yas.add(11);
        Integer yasInt=12;
        yas.remove(yasInt);
        System.out.println(yas);
        System.out.println(cities);//[Miami, Istanbul, Miami, Istanbul, Istanbul, Yozgat]
        List<String>citiesToRemove=new ArrayList<>();
        citiesToRemove.add("Istanbul");
        cities.removeAll(citiesToRemove);
        System.out.println(cities);


    }
}
