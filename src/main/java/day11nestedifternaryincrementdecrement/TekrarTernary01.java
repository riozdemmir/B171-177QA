package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class TekrarTernary01 {
    public static void main(String[] args) {
        //Ternary Statement
        //Ornek1: Sayi 10 dan kucuk ise console a "kucuk" yazdirin degil ise "kucuk degil" yazdirin
        //----------if else cozumu-------
        int a= 9;
        if (a<10){
            System.out.println("Küçük..");
        }else {
            System.out.println("Küçük değil..");
        }
        //---------ternary cozumu----------
        //Condition  ?   Condition true ise calisir  : Condition false ise calisir ;
        String sonuc= a<10 ? "Küçük" : "Küçük değil";
        System.out.println(sonuc);
        //Ornek 2 Sayi cift ise console a "cift" , tek ise "Tek" yazdirin

        //----------if else cozumu-------
        int sayi = 12;
        if (sayi%2 ==0){
            System.out.println("Çift sayı..");
        }else {
            System.out.println("Tek sayı..");
        }
        //---------ternary cozumu----------
        String result=sayi%2 ==0 ? "Çift" : "Tek";
        System.out.println(result);
        //Ornek 3: Sayi 0 dan buyuk ise "pozitif" degilse ekrana "pozitif degil" yazdirin
        int sayi1= -12;
        if (sayi1>0){
            System.out.println("Pozitif");
        }else {
            System.out.println("Pozitif değil");
        }
        //Ternary çözüm

        System.out.println(sayi1>0 ? "Poz" : "Poz değil");

        //Ornek 4: Kullanicidan iki sayi aliniz, "buyuk olmayan" (kucuk veya esit olan) sayiyi yazdiriniz
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz..");
        double s =input.nextDouble();
        double r =input.nextDouble();
        if (s<r){
            System.out.println(s);
        }else {
            System.out.println(r);
        }
        double result3 = s<r ? s : r;
        System.out.println(result3);





    }//Main
}//Class
