package day17arrays;

import java.util.Arrays;

public class Tekrar01 {
    public static void main(String[] args) {
        int arr[]={63,4,7,45,12};
        System.out.println(Arrays.toString(arr));
        //Ornek 1: Verilen array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz.

        int sayac=0;
        for (int w:arr) {
            if (w%2==0){
                sayac++;
            }
        }
        System.out.println("Array de "+sayac+" tane çift sayı ve "+(arr.length-sayac)+" tane tek sayı vardır");

        //Ornek 2:Size verilen bir String arraydeki isimlerden 5 character den az character icerenleri console a yazdiriniz
        String stdNames [] = new String[5];
        stdNames[0]="Ridvan";
        stdNames[1]="Ali";
        stdNames[2]="Efe";
        stdNames[3]="Faruk";
        stdNames[4]="Can";

        for (String w:stdNames ) {
            if (w.length()<5){
                System.out.println(w);
            }

        }

        //Ornek 3: Size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra
        // "F" ile baslayan isimler haric diger isimleri console a yazdiriniz

        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));

        for (String w: stdNames) {
            if (w.startsWith("F")){
                continue;
            }
            System.out.println(w);
        }










    }//Main
}
