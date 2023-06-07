package day09ifstatements;

public class Tekrar01 {
    public static void main(String[] args) {

        //Ornek 1: Sayi uc basamakli ise ekrana "Sayi uc basamaklidir!" yazdirin
        int sayi = -123;
        sayi = Math.abs(sayi);
        if (sayi>99 && sayi<1000){
            System.out.println("Sayı 3 basamaklıdır");
        }

        //Ornek 2: Bir String deki tekrarsiz characterleri ekrana yazdiriniz
        //       abbccdc  ==> ad
        String str = "aac";
        char ch1 = str.charAt(0);
        if (str.indexOf(ch1)==str.lastIndexOf(ch1)){
            System.out.println(ch1);}
        char ch2 =str.charAt(1);
        if (str.indexOf(ch2)==str.lastIndexOf(ch2)){
            System.out.println(ch2);
        }
        char ch3 =str.charAt(2);
        if (str.indexOf(ch3)==str.lastIndexOf(ch3)){
            System.out.println(ch3);
        }







    }
}
