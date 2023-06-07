package day21arraylists;

import java.util.ArrayList;

public class Tekrar01 {
    public static void main(String[] args) {
        //ArrayList nasil olusturulur?
        ArrayList<Integer> ages=new ArrayList<>();
        //Arraylist console a nasil yazdirilir?
        System.out.println(ages);

        //Arraylist lere eleman nasil eklenir?
        //Arraylist lere eleman eklemek icin add()methodunu kullaniriz
        //add() methodu elemanlari sizin verdiginiz sirada "list"e ekler (insertion order)
        ages.add(9);
        ages.add(10);
        ages.add(12);
        ages.add(2,11);
        System.out.println(ages);
        //List'e coklu eleman nasil eklenir? veya Liste baska bir list nasil eklenir?
        //Bir list e coklu eleman eklemek icin o elemanlari oncelikle bir listin icine koymalisiniz
        ArrayList<Integer>newAges=new ArrayList<>();
        newAges.add(13);
        newAges.add(14);
        newAges.add(15);
        ages.addAll(newAges);
        System.out.println(ages);// [9, 10, 11, 12, 13, 14, 15]
        //ArrayList te eleman sayisi nasil bulunur?
        //size() methodu bir list teki eleman sayisini verir
        int numOfElement=ages.size();
        System.out.println(numOfElement);
        //ArrayList te specific bir eleman nasil alinir?
        //get() methodu index kullanarak istedigimiz elemani almaya yarar
        System.out.println(ages.get(2));
        System.out.println(ages.get(ages.size() - 1));//Son elemanı alma..

        //Arraylist te specific bir elemani nasil degisitirebilir?
        System.out.println(ages.set(2, 40));
        System.out.println(ages);

        //Bir listte tum elemanlari nasil silebiliriz?
//        ages.clear();
//        System.out.println(ages);
        //ages.clear();
        //System.out.println(ages);
        //Arraylistte specific bir elemanin var olup olmadigni nasil anlariz?
       boolean result= ages.contains(41);//false
        System.out.println(result);
        //Bir Arraylist'in bos olup olmadigini nasil kontrol ederiz?
        //isEmpty() methodu Arraylist bos ise true bos degilse false return eder.
        boolean result1=ages.isEmpty();
        System.out.println(result1);
        //Ornek 1: Size verilen bir listin bos olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<String> isimler=new ArrayList<>();
        isimler.add("Adil");
        isimler.add("Ahmet");
        isimler.add("Veli");
        isimler.add("Ayfer");
        if (isimler.size()==0){
            System.out.println("List is empty..");
        }else {
            System.out.println("List has at least 1 element");
        }
        isimler.clear();
        if (isimler.isEmpty()){
            System.out.println("List is empty..");

        }else {
            System.out.println("List has at least 1 element");

        }


    }
}
